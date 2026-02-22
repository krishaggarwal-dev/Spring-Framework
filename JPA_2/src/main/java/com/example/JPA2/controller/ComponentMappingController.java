package com.example.JPA2.controller;

import com.example.JPA2.model.Majdoor;
import com.example.JPA2.service.ComponentMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cm")
public class ComponentMappingController {

    @Autowired
    ComponentMappingService service;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Majdoor m)
    {
        service.create(m);
        return ResponseEntity.ok("Done");
    }
    @GetMapping("/all")
    public ResponseEntity<?> get()
    {
        return ResponseEntity.ok(service.getALL());
    }
}
