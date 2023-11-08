package com.ar.cac.tpfinal.services;

import com.ar.cac.tpfinal.entities.User;
import com.ar.cac.tpfinal.entities.dtos.UserDto;
import com.ar.cac.tpfinal.mappers.UserMapper;
import com.ar.cac.tpfinal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<User> getUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }

    public User getUserById(Long id){
        User user = userRepository.findById(id).get();
        return user;
    }

    public UserDto createUser(UserDto user){
        //List<String> users = this.getUsers();
        //users.add(user.getUsername());
        User userEntity = UserMapper.dtoToUser(user);
        User userEntitySaved = userRepository.save(userEntity);
        user = UserMapper.userToDto(userEntitySaved);
        return user;
    }

}
