package com.HermeshqApi.services;

import com.HermeshqApi.interfaces.UserRepository;
import com.HermeshqApi.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Check if the username is already taken
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("This email is already taken");
        }

        // Encode the password before saving
        user.setPassword((user.getPassword()));

        // Save the user
        return userRepository.save(user);
    }
}
