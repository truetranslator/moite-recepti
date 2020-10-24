package bg.softuni.moiterecepti.entities;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Column(name = "description", length = 1000)
    private String descripton;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Reception> reception;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Refrigerator> refrigerator;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Enumerated(EnumType.ORDINAL)
    private Unit unit;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public Set<Reception> getReception() {
        return reception;
    }

    public void setReception(Set<Reception> reception) {
        this.reception = reception;
    }

    public Set<Refrigerator> getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Set<Refrigerator> refrigerator) {
        this.refrigerator = refrigerator;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
