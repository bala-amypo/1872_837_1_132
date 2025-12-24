package com.example.demo.repository;

import com.example.demo.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserProfile, Long> {

    // ✅ REQUIRED BY CustomUserDetailsService
    Optional<UserProfile> findByEmail(String email);
}
