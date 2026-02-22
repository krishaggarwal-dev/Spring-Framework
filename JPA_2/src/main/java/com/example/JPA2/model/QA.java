package com.example.JPA2.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("QA")
public class QA extends Trainee {
    private double salary;
    private int totalTest;
}
