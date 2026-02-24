package com.example.JPA3.Repository;

import com.example.JPA3.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Long> {
}
