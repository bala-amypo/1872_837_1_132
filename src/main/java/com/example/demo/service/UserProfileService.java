package com.example.demo.service;

import com.example.demo.model.UserProfile;
import org.springframework.http.ResponseEntity;

public interface UserProfileService {

    ResponseEntity<UserProfile> createUser(UserProfile profile);

    ResponseEntity<UserProfile> getUser(Long id);

    ResponseEntity<UserProfile> getUserById(Long id);

    void deactivateUser(Long id);
}
