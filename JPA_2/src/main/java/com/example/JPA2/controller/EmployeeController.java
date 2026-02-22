package com.example.JPA2.controller;

import com.example.JPA2.model.Employee;
import com.example.JPA2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @PostMapping("/create")
    ResponseEntity<String> createUser(@RequestBody Employee e)
    {
        service.create(e);
        return ResponseEntity.ok("Successfully Created");
    }

    @GetMapping("all")
    ResponseEntity<List<Employee>> getAll()
    {
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/q1-1")
    ResponseEntity<?> Q1_1()
    {
        return ResponseEntity.ok(service.Q1_1());
    }
    @GetMapping("/q1-2")
    ResponseEntity<?> Q1_2()
    {
        service.Q1_2();
        return ResponseEntity.ok("done");
    }
    @DeleteMapping("/q1-3")
    ResponseEntity<?> Q1_3()
    {
        return ResponseEntity.ok( service.Q1_3());
    }
    @GetMapping("/q2-1")
    ResponseEntity<?> Q2_1()
    {
        return ResponseEntity.ok(service.Q2_1());
    }
    @DeleteMapping("/q2-2")
    ResponseEntity<?> Q2_2()
    {

        return ResponseEntity.ok(service.Q2_2());
    }
}
