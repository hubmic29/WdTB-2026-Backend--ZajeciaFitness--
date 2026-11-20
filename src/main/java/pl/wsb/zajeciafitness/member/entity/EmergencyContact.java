package pl.wsb.zajeciafitness.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EmergencyContact {
    @Column(name = "contact_name", length = 80)
    private String contactName;

    @Column(name = "contact_phone", length = 20)
    private String contactPhone;

    protected EmergencyContact(){
    }
    public EmergencyContact(String contactName, String contactPhone){
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }
}
