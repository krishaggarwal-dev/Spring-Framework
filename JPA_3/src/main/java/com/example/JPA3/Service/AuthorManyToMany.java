package com.example.JPA3.Service;

import com.example.JPA3.Model.Author2;
import com.example.JPA3.Model.Author3;
import com.example.JPA3.Model.Book3;
import com.example.JPA3.Repository.AuthorRepo2;
import com.example.JPA3.Repository.AuthorRepo3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorManyToMany {
    @Autowired
    AuthorRepo3 repo;

    public Author3 save(Author3 author) {
        for(Book3 b : author.getBooks()){
            if (b.getAuthors() == null) {
                b.setAuthors(new java.util.ArrayList<>());
            }

            b.getAuthors().add(author);
        }
        return repo.save(author);
    }
    public List<Author3> getAll()
    {
        return repo.findAll();
    }
}
