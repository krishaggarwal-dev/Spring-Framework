package com.example.JPA2.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Trainee2 {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
}

