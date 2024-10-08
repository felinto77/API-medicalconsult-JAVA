package br.com.thiagofelinto.medicalconsult.user.services;

import br.com.thiagofelinto.medicalconsult.user.domain.User;
import br.com.thiagofelinto.medicalconsult.user.repositories.UserRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> listarUser() {
        return userRepository.findAll();
    }

    public User buscarUser(Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new ObjectNotFoundException("User não encontrado", id));
    }

    public void deleteUser(Long id) {
        User user = buscarUser(id);
        userRepository.delete(user);
    }

    public User atualizarUser(Long id, User userDetails) {

        User user = buscarUser(id);


        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setCpf(userDetails.getCpf());
        user.setPhone(userDetails.getPhone());
        user.setBirthDate(userDetails.getBirthDate());


        return userRepository.save(user);
    }

    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }
}





