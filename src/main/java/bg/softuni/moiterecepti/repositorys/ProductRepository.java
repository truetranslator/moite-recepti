package bg.softuni.moiterecepti.repositorys;

import bg.softuni.moiterecepti.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
