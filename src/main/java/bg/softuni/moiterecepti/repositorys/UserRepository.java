package bg.softuni.moiterecepti.repositorys;

import bg.softuni.moiterecepti.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
