package com.restfulwebservices.restfulpart2.Controller;

import com.restfulwebservices.restfulpart2.Model.User;
import com.restfulwebservices.restfulpart2.repositories.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/swagger-users")
@Tag(name = "Swagger Controller", description = "APIs for managing users")
public class SwaggerController {

    private UserRepository repository;

    public SwaggerController(UserRepository repository) {
        this.repository = repository;
    }

    @Operation(
            summary = "Get all users",
            description = "Fetches list of all users"
    )
    @GetMapping
    public List<User> getUsers() {
        return repository.findAll();
    }

    @Operation(
            summary = "Create user",
            description = "Saves a new user in the system"
    )
    @PostMapping
    public User createUser(@RequestBody User user) {
        return repository.save(user);
    }

    @Operation(
            summary = "Delete user",
            description = "Deletes user by ID"
    )
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        repository.deleteById(id);
        return "User deleted";
    }
}
