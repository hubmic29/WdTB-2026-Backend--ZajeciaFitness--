package pl.wsb.zajeciafitness.equipment.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 60)
    private String name;

    @Column(name = "brand", length = 40)
    private String brand;

    @Column(name = "total_stock", nullable = false)
    private Integer totalStock;

    @Column(name = "available", nullable = false)
    private Boolean available;

    protected Equipment(){
    }

    public Equipment(String name, String brand, Integer totalStock, Boolean available){
        this.name = name;
        this.brand = brand;
        this.totalStock = totalStock;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getTotalStock() {
        return totalStock;
    }

    public Boolean getAvailable() {
        return available;
    }
}
