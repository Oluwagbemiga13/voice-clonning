package cz.fairy.tales.beservice.repository;

import cz.fairy.tales.beservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional <User> findByEmail(String email);

}
