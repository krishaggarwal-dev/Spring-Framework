package com.krish.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/admin/dashboard")
    public String admin() {
        return "Welcome Admin";
    }

    @GetMapping("/user/home")
    public String user() {
        return "Welcome User";
    }
}
