package pl.wsb.zajeciafitness.schedule.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "fitness_class")
public class FitnessClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 80)
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false, length = 20)
    private ClassCategory category;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "starts_at", nullable = false)
    private LocalDateTime startsAt;

    protected FitnessClass(){
    }

    public FitnessClass(String title, ClassCategory category, BigDecimal price, LocalDateTime startsAt){
        this.title = title;
        this.category = category;
        this.price = price;
        this.startsAt = startsAt;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public ClassCategory getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDateTime getStartsAt() {
        return startsAt;
    }
}
