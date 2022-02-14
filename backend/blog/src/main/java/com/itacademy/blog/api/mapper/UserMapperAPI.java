package com.itacademy.blog.api.mapper;

import com.itacademy.blog.data.entity.Role;
import com.itacademy.blog.data.entity.User;
import com.itacademy.blog.services.DTO.RoleDTO;
import com.itacademy.blog.services.DTO.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapperAPI {

    UserMapperAPI INSTANCE = Mappers.getMapper(UserMapperAPI.class);

    UserDTO convert(User user);

    RoleDTO convert(Role value);

    Role convert(RoleDTO value);

    User convert(UserDTO userDTO);

    List<User> convert(List<UserDTO> users);
}
