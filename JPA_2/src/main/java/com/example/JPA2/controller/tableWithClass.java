package com.example.JPA2.controller;

import com.example.JPA2.model.*;
import com.example.JPA2.service.TableWithClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tpc")
public class tableWithClass {
    @Autowired
    TableWithClassService service;
    @PostMapping("/jvm")
    void CreateJVM(@RequestBody JVM3 j)
    {
        service.createJVM(j);
    }
    @PostMapping("/qa")
    void CreateQA(@RequestBody QA3 j)
    {
        service.createQA(j);
    }
    @GetMapping("/get")
    List<Trainee3> get()
    {
        return service.get();
    }
}
