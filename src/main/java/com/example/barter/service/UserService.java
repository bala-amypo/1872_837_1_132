package com.example.barter.service;

import com.example.barter.model.User;
import java.util.List;

public interface UserService {

    User getById(Long id);

    List<User> getAllUsers();

    User updateRating(Long id, double rating);
}
