package com.example.demo.serviceimpl;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public UserProfile create(UserProfile profile) {
        return profile;
    }

    @Override
    public UserProfile getUserById(Long id) {
        return new UserProfile(id, "user", "user@test.com");
    }
}
