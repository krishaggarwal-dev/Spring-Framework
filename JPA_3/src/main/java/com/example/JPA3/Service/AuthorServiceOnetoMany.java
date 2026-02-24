package com.example.JPA3.Service;

import com.example.JPA3.Model.Author;
import com.example.JPA3.Model.Author2;
import com.example.JPA3.Repository.AuthorRepo;
import com.example.JPA3.Repository.AuthorRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceOnetoMany {
    @Autowired
    AuthorRepo2 repo;

    public Author2 save(Author2 author) {
        return repo.save(author);
    }
    public List<Author2> getAll()
    {
        return repo.findAll();
    }
}
