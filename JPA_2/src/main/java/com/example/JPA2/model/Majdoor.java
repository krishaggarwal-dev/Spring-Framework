package com.example.JPA2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Majdoor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private int age;

    @Embedded
    private Salary salary;
}
