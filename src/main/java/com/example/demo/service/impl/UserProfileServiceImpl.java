package com.example.demo.service.impl;

import com.example.demo.model.UserProfile;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.service.UserProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public UserProfile createUser(Object dto) {
        return new UserProfile();
    }

    @Override
    public UserProfile create(UserProfile profile) {
        return profile;
    }

    @Override
    public UserProfile getUserById(Long id) {
        UserProfile u = new UserProfile();
        u.setId(id);
        return u;
    }

    @Override
    public void deactivateUser(Long id) {
        // no-op
    }
}
