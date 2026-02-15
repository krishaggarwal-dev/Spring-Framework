package com.restfulwebservices.restfulpart2.repositories;

import com.restfulwebservices.restfulpart2.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private static List<User> users = new ArrayList<>();
    private static Integer count = 0;

    static {
        users.add(new User(++count,"Krish","krish@example.com","krish@123"));
        users.add(new User(++count,"Sanyam","sanyam@example.com","sanyam@123"));
        users.add(new User(++count,"Pratham","pratham@example.com","pratham@123"));
    }


    public Optional<User> findById(Integer id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        users.add(new User(++count, user.getName(), user.getEmail(), user.getPassword()));
        return users.getLast();
    }

    public void deleteById(Integer id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
