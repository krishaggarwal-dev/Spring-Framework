package com.ttn.spring_core.SpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository repo;

    public DataLoader(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {

        System.out.println("Inserting employees");

        repo.save(new Employee("Krish", "Backend Developer"));
        repo.save(new Employee("Sanyam", "Tester"));
        repo.save(new Employee("Pratham", "DevOps"));
        repo.save(new Employee("Navya", "HR"));

        System.out.println("All Employees:");

        repo.findAll().forEach(e ->
                System.out.println(e.getId() + " " + e.getName() + " " + e.getDesignation()+"....")
        );
    }
}
