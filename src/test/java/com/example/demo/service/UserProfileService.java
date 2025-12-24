package com.example.demo.service;

import com.example.demo.model.UserProfile;
import java.util.List;

public interface UserProfileService {

    UserProfile createUser(Object dto);

    UserProfile create(UserProfile profile);

    UserProfile getUserById(Long id);

    void deactivateUser(Long id);
}
