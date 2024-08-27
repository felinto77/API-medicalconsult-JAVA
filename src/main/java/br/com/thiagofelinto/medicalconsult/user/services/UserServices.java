package br.com.thiagofelinto.medicalconsult.user.services;

import br.com.thiagofelinto.medicalconsult.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServices {

    @Autowired
    private UserRepository userRepository;

}
