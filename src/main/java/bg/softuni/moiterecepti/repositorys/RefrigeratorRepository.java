package bg.softuni.moiterecepti.repositorys;

import bg.softuni.moiterecepti.entities.Refrigerator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefrigeratorRepository extends JpaRepository <Refrigerator, Long> {
}
