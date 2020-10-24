package bg.softuni.moiterecepti.repositorys;

import bg.softuni.moiterecepti.entities.Reception;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionRepository extends JpaRepository <Reception, Long> {
}
