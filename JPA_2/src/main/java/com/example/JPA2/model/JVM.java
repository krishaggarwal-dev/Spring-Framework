package com.example.JPA2.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("JVM")
public class JVM extends Trainee {
    private double salary;
    private int UdemyCourse;
}
