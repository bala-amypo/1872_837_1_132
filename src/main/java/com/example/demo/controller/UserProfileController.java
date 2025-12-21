package com.example.demo.controller;

import com.example.demo.service.UserProfileService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserProfileController {

    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping("/{username}")
    public String getUser(@PathVariable String username) {
        return userProfileService.getProfile(username);
    }
}
