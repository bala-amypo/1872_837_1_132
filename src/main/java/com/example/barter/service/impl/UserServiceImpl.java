package com.example.barter.service.impl;

import com.example.barter.model.UserProfile;
import com.example.barter.repository.UserProfileRepository;
import com.example.barter.service.UserProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // ⭐ THIS IS MANDATORY
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository userProfileRepository;

    public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public UserProfile createProfile(UserProfile profile) {
        return userProfileRepository.save(profile);
    }

    @Override
    public UserProfile getProfileById(Long id) {
        return userProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("UserProfile not found"));
    }

    @Override
    public List<UserProfile> getAllProfiles() {
        return userProfileRepository.findAll();
    }
}
