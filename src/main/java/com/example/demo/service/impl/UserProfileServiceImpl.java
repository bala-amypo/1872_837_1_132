package com.example.demo.service.impl;

import com.example.demo.model.UserProfile;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.service.UserProfileService;
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
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<UserProfile> getAllProfiles() {
        return repository.findAll();
    }
}
