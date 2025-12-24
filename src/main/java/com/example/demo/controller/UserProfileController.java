package com.example.demo.controller;

import com.example.demo.service.UserProfileService;

public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    public void deactivate(Long id) {
        service.deactivateUser(id);
    }
}
