package com.example.JPA3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q9andQ10Controller {
    @GetMapping("/q9")
    public String q9()
    {
        return "Ques: Which method on the session object can be used to remove an object from the cache? \n" +
                "Ans: The method on the Hibernate Session object used to remove a specific object from the first-level cache is evict().\n" +
                "    This detaches the object from the session, so any changes made to it will not be synchronized with the database.  ";
    }
    @GetMapping("/q10")
    public String q10()
    {
        return "Ques: What does @transactional annotation do? \n" +
                "Ans: The @Transactional annotation in the Spring Framework is a declarative transaction management tool.\n" +
                "    It allows developers to define the scope of a database transaction directly on a method or a class \n"+
                "    without writing boilerplate code to manually start, commit, or roll back transactions";
    }

}
