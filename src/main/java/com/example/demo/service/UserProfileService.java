package com.example.demo.service;

import com.example.demo.model.UserProfile;
import org.springframework.http.ResponseEntity;

public interface UserProfileService {

    ResponseEntity<UserProfile> createUser(Object obj);

    ResponseEntity<UserProfile> getUser(Long id);

    void deactivateUser(Long id);
    ResponseEntity<UserProfile> getUserById(Long id);

}
