package pl.wsb.zajeciafitness.reservation.entity;
import jakarta.persistence.*;
import pl.wsb.zajeciafitness.member.entity.Member;
import pl.wsb.zajeciafitness.schedule.entity.FitnessClass;

import javax.swing.text.StyledEditorKit;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "class_reservation")
public class ClassReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fitness_class_id", nullable = false)
    private FitnessClass fitnessClass;

    @Column(name = "booked_at", nullable = false)
    private LocalDateTime bookedAt;

    @Column(name = "confirmed", nullable = false)
    private Boolean confirmed;

    protected ClassReservation(){

    }

    public ClassReservation(Member member, FitnessClass fitnessClass, LocalDateTime bookedAt, Boolean confirmed) {
        this.member = member;
        this.fitnessClass = fitnessClass;
        this.bookedAt = bookedAt;
        this.confirmed = confirmed;
    }

    public Long getId() {
        return id;
    }

    public Member getMember() {
        return member;
    }

    public FitnessClass getFitnessClass() {
        return fitnessClass;
    }

    public LocalDateTime getBookedAt() {
        return bookedAt;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }
}
