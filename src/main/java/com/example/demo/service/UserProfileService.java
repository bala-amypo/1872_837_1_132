package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    public String getProfile(String username) {
        return "Profile for " + username;
    }
}
