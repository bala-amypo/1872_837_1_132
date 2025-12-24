package com.example.demo.service;

import com.example.demo.model.UserProfile;
import org.springframework.http.ResponseEntity;

public class UserProfileService {

    ResponseEntity<UserProfile> createUser(Object obj);

    ResponseEntity<UserProfile> getUser(Long id);

    void deactivateUser(Long id);
}
