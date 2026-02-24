package com.example.JPA3.Repository;

import com.example.JPA3.Model.Author2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo2 extends JpaRepository<Author2,Long> {
}
