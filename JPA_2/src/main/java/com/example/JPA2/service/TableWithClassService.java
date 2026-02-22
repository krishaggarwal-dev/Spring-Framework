package com.example.JPA2.service;

import com.example.JPA2.model.*;
import com.example.JPA2.repository.TableWithClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableWithClassService {
    @Autowired
    TableWithClassRepo repo;
    public void createJVM(JVM3 jvm)
    {
        repo.save(jvm);
    }
    public void createQA(QA3 qa)
    {
        repo.save(qa);
    }
    public List<Trainee3> get()
    {
        return  repo.findAll();
    }
}
