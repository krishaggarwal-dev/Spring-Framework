package com.example.JPA2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employeeTable")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_first_name")
    private String firstName;

    @Column(name = "emp_last_name")
    private String lastName;

    @Column(name = "emp_salary")
    private double salary;

    @Column(name = "emp_age")
    private int age;
}
