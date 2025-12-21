package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    @PostMapping("/profiles")
    public UserProfile create(UserProfile profile) {
        return service.create(profile);
    }

    @GetMapping("/profiles/{id}")
    public UserProfile get(Long id) {
        return service.getUserById(id);
    }
}
