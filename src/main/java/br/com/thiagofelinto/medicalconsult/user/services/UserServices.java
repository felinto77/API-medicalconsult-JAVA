package br.com.thiagofelinto.medicalconsult.user.services;

import br.com.thiagofelinto.medicalconsult.user.domain.User;
import br.com.thiagofelinto.medicalconsult.user.repositories.UserRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> listarUser(){
        return userRepository.findAll();
    }

    public User buscarUser(Long id){
        return userRepository.findById(id).orElseThrow(() ->
                new ObjectNotFoundException("User não encontrado", id));
    }
}
