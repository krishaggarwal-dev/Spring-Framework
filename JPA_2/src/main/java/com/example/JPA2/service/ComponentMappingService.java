package com.example.JPA2.service;

import com.example.JPA2.model.Majdoor;
import com.example.JPA2.repository.MajdoorEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentMappingService {
    @Autowired
    MajdoorEmployee repo;
    public void create(Majdoor m)
    {
        repo.save(m);
    }
    public List<Majdoor> getALL()
    {
        return repo.findAll();
    }
}
