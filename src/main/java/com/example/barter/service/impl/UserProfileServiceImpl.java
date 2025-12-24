package com.example.barter.service.impl;

import com.example.barter.model.UserProfile;
import com.example.barter.repository.UserProfileRepository;
import com.example.barter.service.UserProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository repository;

    public UserProfileServiceImpl(UserProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserProfile createProfile(UserProfile profile) {
        return repository.save(profile);
    }

    @Override
    public UserProfile getProfileById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profile not found"));
    }

    @Override
    public List<UserProfile> getAllProfiles() {
        return repository.findAll();
    }
}
