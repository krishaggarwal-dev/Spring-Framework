package com.example.JPA2.repository;

import com.example.JPA2.model.Trainee2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinedTraineeRepo extends JpaRepository<Trainee2,Long> {
}
