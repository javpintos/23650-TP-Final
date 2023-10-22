package com.ar.cac.tpfinal.controllers;

import com.ar.cac.tpfinal.entities.dtos.UserDto;
import com.ar.cac.tpfinal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //indicamos que queremos trabajar con API REST (parsear/interpretar JSON)
@RequestMapping("/api")
public class UserController {

    // POR CADA ACCION/METODO QUE QUIERA TENER EN MI API
    // VAN A TENER UN METODO EN SU CONTROLADOR

    //METODOS HTTP PERMITIDOS
    // POST, GET (2), PUT, PATCH, DELETE

    //(NUEVO) ESTRUCTURA DE DATOS PARA REST: ResponseEntity

    // NECESITO OBTENER UNA INSTANCIA DEL SERVICIO DE USUARIOS

    @Autowired //con esta anotacion le delegamos al framework que genere la instancia del servicio
    private final UserService userService; // AQUI INYECTAMOS LA INSTANCIA DEL SERVICE

    public UserController (UserService userService){
        this.userService = userService;
    }

    //OBTENER UN ALISTA DE USUARIOS REGISTRADOS (GET)

    @GetMapping(value = "/users")
    public List<String> getUsers(){
        //return List.of("Cristian", "Javier", "Adolfo", "Maria");
        return userService.getUsers();
    }

    // OBTENER UN USUARIO REGISTRADO (GET)

    @GetMapping(value = "/users/{id}")
    public String getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    //AGREGAR/REGISTRAR UN NUEVO USUARIO (POST)
    @PostMapping(value = "/newUser")
    public UserDto createUser(@RequestBody UserDto user){
        return userService.createUser(user);
    }

    // MODIFICAR TOTALMENTE UN USUARIO (PUT)
    public String updateFullUser(){
        return "";
    }

    // MODIFICAR PARCIALMENTE UN USUARIO (PATCH)
    public String updatePartialUser(){
        return "";
    }

    //ELIMINAR UN  USUARIO (DELETE)
    public void deleteUser(){

    }

}
