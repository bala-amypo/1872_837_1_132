package com.example.demo.service.impl;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;

public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public UserProfile createUser(UserProfile profile) {
        return profile;
    }

    @Override
    public UserProfile getUser(Long id) {
        return new UserProfile();
    }

    @Override
    public UserProfile getUserById(Long id) {
        return new UserProfile();
    }

    @Override
    public void deactivateUser(Long id) {
        // no-op
    }
}
