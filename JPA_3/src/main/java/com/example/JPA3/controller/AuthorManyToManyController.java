package com.example.JPA3.controller;

import com.example.JPA3.Model.Author2;
import com.example.JPA3.Model.Author3;
import com.example.JPA3.Service.AuthorManyToMany;
import com.example.JPA3.Service.AuthorServiceOnetoMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/a3")
public class AuthorManyToManyController {
    @Autowired
    AuthorManyToMany service;

    @GetMapping("/all")
    public ResponseEntity<?> all()
    {
        return ResponseEntity.ok(service.getAll());
    }
    @PostMapping("/create")
    public Author3 save(@RequestBody Author3 a){
        return service.save(a);
    }
}
