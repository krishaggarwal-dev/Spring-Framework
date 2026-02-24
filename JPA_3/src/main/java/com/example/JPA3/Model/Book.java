package com.example.JPA3.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;
    @OneToOne(mappedBy = "book")
    private Author author;
}
