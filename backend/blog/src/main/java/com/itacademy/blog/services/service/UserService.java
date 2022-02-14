package com.itacademy.blog.services.service;

import com.itacademy.blog.data.entity.User;
import com.itacademy.blog.services.DTO.RoleDTO;
import com.itacademy.blog.services.DTO.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO createUserDto);

    UserDTO getUserById(Long id);

    RoleDTO getUserRole(Long id);

    Page<UserDTO> findUsers(Integer pageNumber, Integer pageSize, String sort, Specification<User> specification);

    UserDTO updateUser(Long id, UserDTO updateUserDto);

    UserDTO deleteUser(Long id);

    RoleDTO updateUserRole(Long id, RoleDTO updateRoleDto);

}
