package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    @PostMapping
    public UserProfile create(@RequestBody UserProfile user) {
        return service.create(user);
    }

    @GetMapping("/{id}")
    public UserProfile get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping
    public List<UserProfile> getAll() {
        return service.getAll();
    }
}
