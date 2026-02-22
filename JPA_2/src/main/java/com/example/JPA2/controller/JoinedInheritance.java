package com.example.JPA2.controller;

import com.example.JPA2.model.*;
import com.example.JPA2.service.JoinedInheritanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/joined")
public class JoinedInheritance
{
    @Autowired
    JoinedInheritanceService service;
    @PostMapping("/jvm")
    void CreateJVM(@RequestBody JVM2 j)
    {
        service.createJVM(j);
    }
    @PostMapping("/qa")
    void CreateQA(@RequestBody QA2 j)
    {
        service.createQA(j);
    }
    @GetMapping("/get")
    List<Trainee2> get()
    {
        return service.get();
    }
}
