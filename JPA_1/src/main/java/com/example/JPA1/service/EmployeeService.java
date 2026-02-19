package com.example.JPA1.service;

import com.example.JPA1.model.Employee;
import com.example.JPA1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public void update(Employee e) {

        Employee emp = repository.findById(e.getId())
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        emp.setName(e.getName());
        emp.setAge(e.getAge());
        emp.setLocation(e.getLocation());

        repository.save(emp);
    }
    public List<Employee> getAll()
    {
        return repository.findAll();
    }
    public Optional<Employee> deleteById(Long id)
    {
        Optional<Employee> e=repository.findById(id);
        return e;
    }
    public Integer count()
    {
        return Math.toIntExact(repository.count());
    }
    public Page<Employee> pagingAndSorting(int page, int size)
    {
        Pageable p = PageRequest.of(page, size, Sort.by("age").ascending());
        return repository.findAll(p);
    }
    public List<Employee> finderName(String name)
    {
        return repository.findByName(name);
    }
    public List<Employee> finderNameA()
    {
        return repository.findByNameLike("A%");
    }
    public List<Employee> ageBetween()
    {
        return repository.findByAgeBetween(28,32);
    }

}
