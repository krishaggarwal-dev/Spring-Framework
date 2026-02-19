package com.example.JPA1.repository;

import com.example.JPA1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
List<Employee> findByName(String name);
List<Employee> findByNameLike(String name);
List<Employee> findByAgeBetween(int ageAfter, int ageBefore);
}
