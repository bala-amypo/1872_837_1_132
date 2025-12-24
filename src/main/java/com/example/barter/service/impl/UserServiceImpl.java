package com.example.barter.service.impl;

import com.example.barter.model.User;
import com.example.barter.repository.UserRepository;
import com.example.barter.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User updateRating(Long id, double rating) {
        User user = getById(id);
        user.setRating(rating);
        return repository.save(user);
    }
}
