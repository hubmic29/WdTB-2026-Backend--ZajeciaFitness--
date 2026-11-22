package pl.wsb.zajeciafitness.equipment.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import pl.wsb.zajeciafitness.schedule.entity.FitnessClass;

@Entity
@Table(name = "class_equipment")
public class ClassEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fitness_class_id", nullable = false)
    private FitnessClass fitnessClass;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "equipment_id", nullable = false)
    private Equipment equipment;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "notes", length = 120)
    private String notes;

    protected ClassEquipment(){

    }

    public ClassEquipment(FitnessClass fitnessClass, Equipment equipment, Integer quantity, String notes){
        this.fitnessClass = fitnessClass;
        this.equipment = equipment;
        this.notes = notes;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public FitnessClass getFitnessClass() {
        return fitnessClass;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getNotes() {
        return notes;
    }
}
