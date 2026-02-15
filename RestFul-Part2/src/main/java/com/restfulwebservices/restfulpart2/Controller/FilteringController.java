package com.restfulwebservices.restfulpart2.Controller;


import com.fasterxml.jackson.annotation.JsonView;
import com.restfulwebservices.restfulpart2.Model.User;
import com.restfulwebservices.restfulpart2.repositories.UserRepository;
import com.restfulwebservices.restfulpart2.views.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    private UserRepository repository;

    @Autowired
    public FilteringController(UserRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/users-static")
    public User saveUserStatic(@RequestBody User user) {
        return repository.save(user);
    }


    @PostMapping("/users-dynamic")
    @JsonView(Views.View1.class)
    public User saveUserDynamic(@RequestBody User user) {
        return repository.save(user);
    }

}
