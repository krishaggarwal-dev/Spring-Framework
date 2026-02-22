package com.example.JPA2.repository;

import com.example.JPA2.model.Trainee3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableWithClassRepo extends JpaRepository<Trainee3,Long> {
}
