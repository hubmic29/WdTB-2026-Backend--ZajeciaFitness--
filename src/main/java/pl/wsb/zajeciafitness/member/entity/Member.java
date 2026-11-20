package pl.wsb.zajeciafitness.member.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 80)
    private String fullName;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "joined_on", nullable = false)
    private LocalDate joinedOn;

    @Embedded
    private EmergencyContact emergencyContact;

    protected Member(){

    }

    public Member(String phone, LocalDate joinedOn, EmergencyContact emergencyContact){
        this.fullName = fullName;
        this.phone = phone;
        this.joinedOn = joinedOn;
        this.emergencyContact = emergencyContact;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getJoinedOn() {
        return joinedOn;
    }

    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }
}
