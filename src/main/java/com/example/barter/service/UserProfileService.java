package com.example.barter.service;

import com.example.barter.model.UserProfile;
import java.util.List;

public interface UserProfileService {

    UserProfile createUser(UserProfile user);

    UserProfile getUser(Long id);

    List<UserProfile> getAllUsers();

    void deactivateUser(Long id);
}
