package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    // ✅ MUST return ResponseEntity<UserProfile>
    @PostMapping
    public ResponseEntity<UserProfile> create(@RequestBody UserProfile user) {
        return ResponseEntity.ok(service.createUser(user));
    }

    // ✅ MUST return ResponseEntity<UserProfile>
    @GetMapping("/{id}")
    public ResponseEntity<UserProfile> get(@PathVariable long id) {
        return ResponseEntity.ok(service.getUserById(id));
    }

    // ✅ MUST return ResponseEntity (not void)
    @PutMapping("/deactivate/{id}")
    public ResponseEntity<Void> deactivate(@PathVariable long id) {
        service.deactivateUser(id);
        return ResponseEntity.ok().build();
    }
}
