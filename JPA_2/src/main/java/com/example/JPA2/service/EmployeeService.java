package com.example.JPA2.service;

import com.example.JPA2.repository.EmployeeRepository;
import com.example.JPA2.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;
    
    public void create(Employee e)
    {
        repository.save(e);
    }

    public List<Employee> getAll()
    {
        return repository.findAll();
    }
    public ResponseEntity<?> Q1_1()
    {
        return ResponseEntity.ok(repository.getEmployeesAboveAvg());
    }
    @Transactional
    public void Q1_2() {
        double avg = repository.getAvgSalary();
        repository.updateBelowAvg(100000, avg);
    }
    @Transactional
    public double Q1_3() {
        double min = repository.dsalary();
        repository.deleteMin(min);
        return min;
    }
    public Employee Q2_1() {
        return repository.lastName("Singh");
    }
    public int Q2_2() {
         return repository.deleteAfterAge(40);
    }


}
