package mserv.user.domain.repository;

import mserv.user.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> getAll();
    Optional<User> getUser(int userId);
    User save(User user);
    void delete(int userId);
}
