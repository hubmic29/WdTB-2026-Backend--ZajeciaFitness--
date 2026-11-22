package pl.wsb.zajeciafitness.schedule.entity;

import jakarta.persistence.*;
import pl.wsb.zajeciafitness.room.entity.TrainingRoom;

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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "room_id", nullable = false)
    private TrainingRoom room;

    protected FitnessClass(){
    }

    public FitnessClass(String title, ClassCategory category, BigDecimal price, LocalDateTime startsAt, TrainingRoom room){
        this.title = title;
        this.category = category;
        this.price = price;
        this.startsAt = startsAt;
        this.room = room;
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

    public TrainingRoom getRoom() {
        return room;
    }
}
