package com.example.JPA2.repository;

import com.example.JPA2.model.Majdoor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajdoorEmployee extends JpaRepository<Majdoor,Long> {

}
