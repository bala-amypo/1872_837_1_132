package com.example.demo.service;

import com.example.demo.model.UserProfile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserProfile register(UserProfile user) {
        return user;
    }

    public UserProfile getUser(Long id) {
        return new UserProfile(id, "testuser", "test@email.com");
    }

    public List<UserProfile> getAllUsers() {
        return List.of(new UserProfile(1L, "user", "email"));
    }
}
