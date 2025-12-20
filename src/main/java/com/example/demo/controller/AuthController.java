package com.example.barter.controller;

import com.example.barter.dto.AuthRequest;
import com.example.barter.dto.AuthResponse;
import com.example.barter.model.User;
import com.example.barter.security.JwtUtil;
import com.example.barter.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    public AuthController(UserService userService,
                          AuthenticationManager authenticationManager,
                          JwtUtil jwtUtil) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody User user) {
        User savedUser = userService.register(user);
        String token = jwtUtil.generateToken(savedUser.getEmail());

        return ResponseEntity.ok(
                new AuthResponse(token, savedUser.getId(),
                        savedUser.getEmail(), savedUser.getRole())
        );
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        Authentication auth = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(), request.getPassword()
                )
        );

        User user = userService.findByEmail(request.getEmail());
        String token = jwtUtil.generateToken(user.getEmail());

        return ResponseEntity.ok(
                new AuthResponse(token, user.getId(),
                        user.getEmail(), user.getRole())
        );
    }
}
