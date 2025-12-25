package com.example.demo.service;

import com.example.demo.model.UserProfile;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    public UserProfile createUser(Object obj) {
        return (UserProfile) obj;
    }

    public UserProfile getUserById(long id) {
        UserProfile u = new UserProfile();
        u.setId(id);
        u.setUsername("user");
        return u;
    }

    public void deactivateUser(long id) {
        // dummy
    }
}
