package com.bewell.ms.tests.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/tests")
public class TestController {

    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/admin")
    public String adminAccess() {
        return "Admin Content.";
    }
}
