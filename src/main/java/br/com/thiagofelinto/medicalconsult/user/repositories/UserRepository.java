package br.com.thiagofelinto.medicalconsult.user.repositories;

import br.com.thiagofelinto.medicalconsult.user.domain.User;
import com.sun.jdi.LongType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
}
