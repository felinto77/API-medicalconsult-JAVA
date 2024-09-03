package br.com.thiagofelinto.medicalconsult.user.resource;

import br.com.thiagofelinto.medicalconsult.user.domain.User;
import br.com.thiagofelinto.medicalconsult.user.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserServices service;

    @PostMapping("/createuser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = service.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping("/listaruser")
    public ResponseEntity<List<User>> listarUser(){
        List<User> users = service.listarUser();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> buscarUser(@PathVariable Long id){
        User user = service.buscarUser(id);
        return ResponseEntity.ok().body(user);
    }
}
