package com.example.JPA2.controller;

import com.example.JPA2.model.JVM;
import com.example.JPA2.model.QA;
import com.example.JPA2.service.SingledInheritanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/single")
public class SingledInheritance {
    @Autowired
    SingledInheritanceService service;
    @PostMapping("/jvm")
    void CreateJVM(@RequestBody JVM j)
    {
        service.createJVM(j);
    }
    @PostMapping("/qa")
    void CreateQA(@RequestBody QA j)
    {
        service.createQA(j);
    }

}
