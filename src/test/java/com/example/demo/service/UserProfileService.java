package com.example.demo.service;

import com.example.demo.model.UserProfile;
import java.util.List;

public interface UserProfileService {
    UserProfile create(UserProfile profile);
    UserProfile get(Long id);
    void deactivateUser(Long id);
}
