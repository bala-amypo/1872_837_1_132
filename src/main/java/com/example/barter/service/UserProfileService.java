package com.example.barter.service;

import com.example.barter.model.UserProfile;

import java.util.List;

public interface UserProfileService {

    UserProfile createProfile(UserProfile profile);

    UserProfile getProfileById(Long id);

    List<UserProfile> getAllProfiles();
}
