package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class UserProfileController {

    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    // CREATE profile
    @PostMapping
    public ResponseEntity<UserProfile> createProfile(
            @RequestBody UserProfile profile) {

        return ResponseEntity.ok(
                userProfileService.createProfile(profile)
        );
    }

    // GET profile by ID
    @GetMapping("/{id}")
    public ResponseEntity<UserProfile> getProfile(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                userProfileService.getProfileById(id)
        );
    }

    // GET all profiles
    @GetMapping
    public ResponseEntity<List<UserProfile>> getAllProfiles() {

        return ResponseEntity.ok(
                userProfileService.getAllProfiles()
        );
    }
}
