package mserv.user.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import mserv.user.persistence.entity.User;

import java.util.List;

public interface UserRepository {
List<User> getAll();
User save(User user);
void delete(int id);

}
