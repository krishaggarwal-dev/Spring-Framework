package com.restfulwebservices.restfulpart2.Controller;

import com.restfulwebservices.restfulpart2.Model.UserV1;
import com.restfulwebservices.restfulpart2.Model.UserV2;
import org.springframework.web.bind.annotation.*;

@RestController
public class VersioningController {

    @GetMapping("/v1/user")
    public UserV1 uriV1() {
        return new UserV1(1, "Krish");
    }

    @GetMapping("/v2/user")
    public UserV2 uriV2() {
        return new UserV2(1, "Krish", "krish@gmail.com", "ADMIN");
    }

    @GetMapping(value="/user/param", params="version=1")
    public UserV1 paramV1() {
        return new UserV1(1, "Krish");
    }

    @GetMapping(value="/user/param", params="version=2")
    public UserV2 paramV2() {
        return new UserV2(1, "Krish", "krish@gmail.com", "ADMIN");
    }


    @GetMapping(value="/user/header", headers="X-API-VERSION=1")
    public UserV1 headerV1() {
        return new UserV1(1, "Krish");
    }

    @GetMapping(value="/user/header", headers="X-API-VERSION=2")
    public UserV2 headerV2() {
        return new UserV2(1, "Krish", "krish@gmail.com", "ADMIN");
    }


    @GetMapping(value="/user/produces",
            produces="application/vnd.company.app-v1+json")
    public UserV1 mimeV1() {
        return new UserV1(1, "Krish");
    }

    @GetMapping(value="/user/produces",
            produces="application/vnd.company.app-v2+json")
    public UserV2 mimeV2() {
        return new UserV2(1, "Krish", "krish@gmail.com", "ADMIN");
    }
}