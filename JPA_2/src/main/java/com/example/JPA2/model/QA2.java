package com.example.JPA2.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class QA2 extends Trainee2 {
    private double salary;
    private int totalTest;
}