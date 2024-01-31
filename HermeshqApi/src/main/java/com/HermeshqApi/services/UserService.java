package com.HermeshqApi.services;

import com.HermeshqApi.interfaces.UserRepository;
import com.HermeshqApi.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User registerUser(User user) {
        // Check if the username is already taken
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new RuntimeException("Username is already taken");
        }

        // Encode the password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Save the user
        return userRepository.save(user);
    }
}
