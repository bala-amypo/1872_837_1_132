package com.example.demo.service;

import com.example.demo.model.UserProfile;
import java.util.List;

public interface UserProfileService {

    UserProfile createProfile(UserProfile profile);

    UserProfile getProfileById(Long id);

    List<UserProfile> getAllProfiles();
}
