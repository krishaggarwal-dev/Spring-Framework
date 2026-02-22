package com.example.JPA2.repository;

import com.example.JPA2.model.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingleTraineeRepo extends JpaRepository<Trainee,Long> {
}
