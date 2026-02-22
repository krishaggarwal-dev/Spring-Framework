package com.example.JPA2.service;

import com.example.JPA2.model.JVM;
import com.example.JPA2.model.QA;
import com.example.JPA2.repository.SingleTraineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingledInheritanceService {
    @Autowired
    SingleTraineeRepo repo;
    public void createJVM(JVM jvm)
    {
        repo.save(jvm);
    }
    public void createQA(QA qa)
    {
        repo.save(qa);
    }
}
