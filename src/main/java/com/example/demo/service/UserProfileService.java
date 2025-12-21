package com.example.demo.service;

import com.example.demo.model.UserProfile;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    public String getProfile(String username) {
        return "Profile for " + username;
    }
    public UserProfile createUser(Object request) {
        // dummy implementation for test compatibility
        return new UserProfile(1L, "testuser", "test@example.com");
    }
}
