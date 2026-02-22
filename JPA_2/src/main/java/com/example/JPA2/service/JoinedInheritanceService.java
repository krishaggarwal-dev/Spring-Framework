package com.example.JPA2.service;

import com.example.JPA2.model.*;
import com.example.JPA2.repository.JoinedTraineeRepo;
import com.example.JPA2.repository.SingleTraineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinedInheritanceService
{
    @Autowired
    JoinedTraineeRepo repo;
    public void createJVM(JVM2 jvm)
    {
        repo.save(jvm);
    }
    public void createQA(QA2 qa)
    {
        repo.save(qa);
    }
    public List<Trainee2> get()
    {
        return  repo.findAll();
    }
}
