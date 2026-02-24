package com.example.JPA3.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Author3 {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "author_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book3> books;

}

