package uzvagontamir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzvagontamir.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
