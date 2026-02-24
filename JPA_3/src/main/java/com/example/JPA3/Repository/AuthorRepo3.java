package com.example.JPA3.Repository;

import com.example.JPA3.Model.Author3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo3 extends JpaRepository<Author3,Long> {
}
