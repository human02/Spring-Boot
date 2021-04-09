package com.aarav.bootjpa_eg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    // All fields that are required in the database
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // For auto-increment
    private int id;

    private String name;
    private String city;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int id, String name, String city, String address) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User [address=" + address + ", city=" + city + ", id=" + id + ", name=" + name + "]";
    }

}
