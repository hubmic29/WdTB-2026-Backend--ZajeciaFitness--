package pl.wsb.zajeciafitness.room.entity;
import jakarta.persistence.*;
import pl.wsb.zajeciafitness.schedule.entity.FitnessClass;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Training_room")
public class TrainingRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = false, unique = true, length = 60)
    private String name;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "floor", nullable = false)
    private Integer floor;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @OneToMany(mappedBy = "room")
    private List<FitnessClass> classes = new ArrayList<>();

    protected TrainingRoom(){
    }

    public TrainingRoom(String name, Integer capacity, Integer floor, Boolean active){
        this.name = name;
        this.capacity = capacity;
        this.floor = floor;
        this.active = active;
    }
    public Long getId(){return id;}
    public String getName(){return name;}
    public Integer getCapacity(){return capacity;}
    public Integer getFloor(){return floor;}
    public Boolean getActive(){return active;}
    public List<FitnessClass> getClasses(){return classes;}
}
