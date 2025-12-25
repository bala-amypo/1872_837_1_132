package com.example.demo.service;

import com.example.demo.model.UserProfile;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    public UserProfile createUser(Object obj) {
        return (UserProfile) obj;
    }

    public UserProfile getUserById(long id) {
        return new UserProfile(id, "user", "email@test.com");
    }

    public UserProfile getUsersById(long id) {
        return getUserById(id);
    }
}
