package com.restfulwebservices.restfulpart2.Controller;

import com.restfulwebservices.restfulpart2.Model.User;
import com.restfulwebservices.restfulpart2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class HateoasController {

    private UserRepository repository;

    @Autowired
    public HateoasController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Husers/{id}")
    public EntityModel<User> getUser(@PathVariable Integer id) {

        Optional<User> user = repository.findById(id);

        EntityModel<User> resource = EntityModel.of(user.get());

        resource.add(linkTo(methodOn(HateoasController.class)
                .getAllUsers()).withRel("all-users"));
        return resource;
    }
    @GetMapping("/Husers")
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
