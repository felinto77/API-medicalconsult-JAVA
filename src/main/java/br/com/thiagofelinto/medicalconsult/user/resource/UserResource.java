package br.com.thiagofelinto.medicalconsult.user.resource;

import br.com.thiagofelinto.medicalconsult.user.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserResource {
    @Autowired
    private UserServices service;
}
