package com.example.barter.controller;

import com.example.barter.model.UserProfile;
import com.example.barter.service.UserProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    @PostMapping
    public UserProfile create(@RequestBody UserProfile user) {
        return service.createUser(user);
    }

    @GetMapping("/{id}")
    public UserProfile get(@PathVariable Long id) {
        return service.getUser(id);
    }

    @GetMapping
    public List<UserProfile> getAll() {
        return service.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deactivate(@PathVariable Long id) {
        service.deactivateUser(id);
    }
}
