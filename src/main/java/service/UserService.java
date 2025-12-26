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
        UserProfile u = new UserProfile();
        u.setId(id);
        u.setUsername("user");
        return u;
    }

    public List<UserProfile> getAllUsers() {
        UserProfile u = new UserProfile();
        u.setId(1L);
        u.setUsername("user");
        return List.of(u);
    }
}
