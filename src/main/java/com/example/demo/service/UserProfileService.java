package com.example.demo.service;

import com.example.demo.model.UserProfile;
import org.springframework.http.ResponseEntity;

public class UserProfileService {

    public ResponseEntity<UserProfile> createUser(Object obj) {
        return ResponseEntity.ok(new UserProfile());
    }

    public ResponseEntity<UserProfile> getUser(Long id) {
        return ResponseEntity.ok(new UserProfile());
    }

    public void deactivateUser(Long id) {
        // no-op
    }
}
