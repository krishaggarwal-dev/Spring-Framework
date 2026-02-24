package com.example.JPA3.Model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}