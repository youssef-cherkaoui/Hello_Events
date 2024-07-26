package com.example.hello_events.Model.mapper;

import com.example.hello_events.Model.Dto.UserDTO;
import com.example.hello_events.Model.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDTO DTO);
    UserDTO toDTO(User entity);
    List<UserDTO> toDTOList(List<User> users);
    List<User> toEntityList(List<UserDTO> userDTOs);
}

