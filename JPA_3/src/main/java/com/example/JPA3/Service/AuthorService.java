package com.example.JPA3.Service;

import com.example.JPA3.Model.Author;
import com.example.JPA3.Repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepo repo;

    public Author save(Author author) {
        return repo.save(author);
    }
    public List<Author> getAll()
    {
        return repo.findAll();
    }
}