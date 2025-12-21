package com.example.demo.service;

import com.example.demo.model.UserProfile;

public interface UserProfileService {
    UserProfile create(UserProfile profile);
    UserProfile getUserById(Long id);
}
