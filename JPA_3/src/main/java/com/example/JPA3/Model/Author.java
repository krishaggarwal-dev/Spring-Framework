package com.example.JPA3.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    @Embedded
    Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    Book book;
    @ElementCollection
    @CollectionTable(name = "author_subject",
    joinColumns = @JoinColumn(name = "author_id"))
    @Column(name = "subjects")
    List<String> subjects;
}
