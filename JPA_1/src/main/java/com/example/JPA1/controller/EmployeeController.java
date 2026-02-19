package com.example.JPA1.controller;

import com.example.JPA1.model.Employee;
import com.example.JPA1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

    @PutMapping("/update")
    ResponseEntity<String> updateUser(@RequestBody Employee e)
    {
        service.update(e);
        return ResponseEntity.ok("Successfully Created");
    }
    @GetMapping("all")
    ResponseEntity<List<Employee>> getAll()
    {
        return ResponseEntity.ok(service.getAll());
    }
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Optional<Employee>> deleteById(@PathVariable Long id)
    {
        return ResponseEntity.ok(service.deleteById(id));
    }

    @GetMapping("/count")
    ResponseEntity<Integer> count()
    {
        return ResponseEntity.ok(service.count());
    }

    @GetMapping("/paging")
    ResponseEntity<Page<Employee>> count(@RequestParam int page, @RequestParam int size)
    {
        return ResponseEntity.ok(service.pagingAndSorting(page,size));
    }
    @GetMapping("/name/{name}")
    ResponseEntity<List<Employee>> namefind(@PathVariable String name)
    {
        return ResponseEntity.ok(service.finderName(name));
    }
    @GetMapping("/nameWithA")
    ResponseEntity<List<Employee>> startingWithA()
    {
        return ResponseEntity.ok(service.finderNameA());
    }
    @GetMapping("/age28-32")
    ResponseEntity<List<Employee>> ageBetween()
    {
        return ResponseEntity.ok(service.ageBetween());
    }

}
