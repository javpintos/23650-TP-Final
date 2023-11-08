package com.ar.cac.tpfinal.mappers;

import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.entities.dtos.UserDto;

public class UserMapper {
    public static User dtoToUser(UserDto dto){
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        return user;
    }

    public static UserDto userToDto(User user){
        UserDto userDto = new UserDto();
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        userDto.setId(user.getId());
        return userDto;
    }

}
