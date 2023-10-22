package com.ar.cac.tpfinal.services;

import com.ar.cac.tpfinal.entities.dtos.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<String> getUsers(){
        List<String> users = new ArrayList<String>();
        users.add("Javier");
        users.add("Adolfo");
        users.add("Cristian");
        users.add("María");
        return users;
    }

    public String getUserById(Long Id){
        List<String> users = this.getUsers();
        return users.get(1);
    }

    public UserDto createUser(UserDto user){
        List<String> users = this.getUsers();
        users.add(user.getUsername());
        return user;
    }

}
