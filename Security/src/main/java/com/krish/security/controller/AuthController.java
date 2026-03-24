package com.krish.security.controller;

import com.krish.security.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> req) {

        service.register(
                req.get("username"),
                req.get("password"),
                req.get("role")
        );

        return "User Registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> req) {

        System.out.println("LOGIN API HIT");
        return service.login(
                req.get("username"),
                req.get("password")
        );
    }
}
