package com.example.JPA1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@SpringBootApplication
public class Jpa1Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Jpa1Application.class, args);
	}

}
