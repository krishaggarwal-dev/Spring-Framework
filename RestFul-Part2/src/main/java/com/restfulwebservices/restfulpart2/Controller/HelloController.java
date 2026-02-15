package com.restfulwebservices.restfulpart2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello")
    public String sayHello(@RequestParam String username, Locale locale) {
        return messageSource.getMessage("greeting.message", new Object[]{username}, locale);
    }
}
