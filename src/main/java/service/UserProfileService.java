package com.example.demo.service;

import com.example.demo.model.UserProfile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {

    public UserProfile create(UserProfile user) {
        return user;
    }

    public UserProfile get(Long id) {
        return new UserProfile(id, "testuser", "test@email.com");
    }

    public List<UserProfile> getAll() {
        return List.of(new UserProfile(1L, "user", "email"));
    }
}
