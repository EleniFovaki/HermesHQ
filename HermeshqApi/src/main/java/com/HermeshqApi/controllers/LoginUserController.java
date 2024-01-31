package com.HermeshqApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        try {
            // Query for the user with the provided username
            User user = entityManager.createQuery("SELECT u FROM User u WHERE u.username = :username", User.class)
                    .setParameter("username", request.getUsername())
                    .getSingleResult();

            // Check if the entered password matches the hashed password from the database
            if (passwordEncoder.matches(request.getPassword(), user.getPassword())) {
                // Successful login
                return new LoginResponse(true, "Login successful");
            } else {
                // Invalid password
                return new LoginResponse(false, "Invalid password");
            }
        } catch (NoResultException e) {
            // User not found
            return new LoginResponse(false, "User not found");
        }
    }
}
