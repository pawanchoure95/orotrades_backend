package com.btl.orotrades.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "phone_no", length = 10)
    private String phoneNo;

    private String place;

    @Column(length = 6)
    private String pincode;

    @Column(name = "pancard_no", unique = true)
    private String pancardNo;

    // Constructors
    public User() {}

    public User(String name, String phoneNo, String place, String pincode, String pancardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.place = place;
        this.pincode = pincode;
        this.pancardNo = pancardNo;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getPlace() {
        return place;
    }

    public String getPincode() {
        return pincode;
    }

    public String getPancardNo() {
        return pancardNo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setPancardNo(String pancardNo) {
        this.pancardNo = pancardNo;
    }
}
