package com.example.barter.service;

import com.example.barter.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User updateRating(Long userId, double rating);
}
