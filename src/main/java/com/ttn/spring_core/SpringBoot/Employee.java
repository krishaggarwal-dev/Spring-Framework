package com.ttn.spring_core.SpringBoot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String designation;

    public Employee() {}

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    // getters setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDesignation() { return designation; }

    public void setName(String name) { this.name = name; }
    public void setDesignation(String designation) { this.designation = designation; }
}
