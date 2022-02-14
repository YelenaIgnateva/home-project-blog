package com.itacademy.blog.api;

import com.itacademy.blog.api.mapper.UserMapperAPI;
import com.itacademy.blog.data.entity.Role;
import com.itacademy.blog.data.entity.User;
import com.itacademy.blog.services.DTO.RoleDTO;
import com.itacademy.blog.services.DTO.UserDTO;
import com.itacademy.blog.services.mapper.UserMapper;
import com.itacademy.blog.services.query.EntitySpecificationService;
import com.itacademy.blog.services.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.*;

@RestController
@Controller
@RequestMapping("/users")
public class UsersApiController {
    private final UserService userService;
    private EntitySpecificationService entitySpecificationService;

    @Autowired
    public UsersApiController(UserService userService, EntitySpecificationService entitySpecificationService) {
        this.userService = userService;
        this.entitySpecificationService = entitySpecificationService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        UserDTO createUserDto = UserMapperAPI.INSTANCE.convert(user);
        UserDTO readUserDto = userService.createUser(createUserDto);
        User returnUser = UserMapperAPI.INSTANCE.convert(readUserDto);
        return new ResponseEntity<User>(returnUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        UserDTO readUserDto = userService.getUserById(id.longValue());
        User returnUser = UserMapperAPI.INSTANCE.convert(readUserDto);
        return new ResponseEntity<>(returnUser, HttpStatus.OK);
    }

    @GetMapping("/{id}/role")
    public ResponseEntity<Role> getUserRole(@PathVariable BigDecimal id) {
        RoleDTO role = userService.getUserRole(id.longValue());
        Role toReturn = UserMapperAPI.INSTANCE.convert(role);
        return new ResponseEntity<>(toReturn, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getUsers(@Valid BigDecimal id, @Valid String name, @Valid String sort, @Valid Integer pageNum, @Valid Integer pageSize) {
        Map<String, String> filterMap = new HashMap<>();
        if (id != null) {
            filterMap.put("id", id.toString());
        } else {
            filterMap.put("id", null);
        }
        filterMap.put("name", name);
        Page<UserDTO> users = userService.findUsers(Optional.ofNullable(pageNum).orElse(1)
                , Optional.ofNullable(pageSize).orElse(10), Optional.ofNullable(sort).orElse("-id")
                , entitySpecificationService.getSpecification(filterMap));
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("X-Total-Count", String.valueOf(users.getTotalElements()));
        return new ResponseEntity<List<User>>(UserMapperAPI.INSTANCE.convert(users.toList()), responseHeaders, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable BigDecimal id, @RequestBody User user) {
        UserDTO updateUserDto = UserMapperAPI.INSTANCE.convert(user);
        UserDTO readUserDto = userService.updateUser(id.longValue(), updateUserDto);
        User returnUser = UserMapperAPI.INSTANCE.convert(readUserDto);
        return new ResponseEntity<>(returnUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> removeUser(@PathVariable BigDecimal id) {
        Optional<UserDTO> optionalUserDTO = Optional.ofNullable(userService.deleteUser(id.longValue()));

        User returnUser = UserMapperAPI.INSTANCE.convert(optionalUserDTO.get());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/{id}/role")
    public ResponseEntity<Role> updateUserRole(@PathVariable BigDecimal id, @RequestBody Role role) {
        RoleDTO updateRoleDto = UserMapperAPI.INSTANCE.convert(role);
        RoleDTO readRoleDto = userService.updateUserRole(id.longValue(), updateRoleDto);
        Role returnRole = UserMapperAPI.INSTANCE.convert(readRoleDto);
        return new ResponseEntity<>(returnRole, HttpStatus.OK);
    }

}
