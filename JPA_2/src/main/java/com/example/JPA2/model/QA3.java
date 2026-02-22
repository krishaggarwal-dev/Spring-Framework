package com.example.JPA2.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class QA3 extends Trainee3 {
    private double salary;
    private int totalTest;
}