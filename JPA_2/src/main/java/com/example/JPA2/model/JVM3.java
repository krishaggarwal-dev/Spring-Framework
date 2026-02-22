package com.example.JPA2.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class JVM3 extends Trainee3 {
    private double salary;
    private int UdemyCourse;
}
