package com.example.demo.service.impl;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.http.ResponseEntity;

public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public ResponseEntity<UserProfile> createUser(UserProfile profile) {
        return ResponseEntity.ok(profile);
    }

    @Override
    public ResponseEntity<UserProfile> getUser(Long id) {
        return ResponseEntity.ok(new UserProfile());
    }

    @Override
    public ResponseEntity<UserProfile> getUserById(Long id) {
        return ResponseEntity.ok(new UserProfile());
    }

    @Override
    public void deactivateUser(Long id) {
        // no-op
    }
}
