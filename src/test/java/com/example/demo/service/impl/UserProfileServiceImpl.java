package com.example.demo.service.impl;

import com.example.demo.model.UserProfile;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.service.UserProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public UserProfile create(UserProfile profile) {
        return profile;
    }

    @Override
    public UserProfile get(Long id) {
        return new UserProfile();
    }

    @Override
    public void deactivateUser(Long id) {}
}
