package com.example.JPA3.controller;

import com.example.JPA3.Model.Author;
import com.example.JPA3.Model.Author2;
import com.example.JPA3.Service.AuthorService;
import com.example.JPA3.Service.AuthorServiceOnetoMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author2")
public class AuthorOneTOMAnyController {

    @Autowired
    AuthorServiceOnetoMany service;

    @GetMapping("/all")
    public ResponseEntity<?> all()
    {
        return ResponseEntity.ok(service.getAll());
    }
    @PostMapping("/create")
    public Author2 save(@RequestBody Author2 a){
        return service.save(a);
    }
}
