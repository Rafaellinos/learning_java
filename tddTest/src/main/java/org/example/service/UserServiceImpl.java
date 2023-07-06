package org.example.service;

import org.example.data.UserRepository;
import org.example.model.User;
import org.example.model.exception.PasswordNotMatchException;
import org.example.model.exception.UserServiceException;

import java.util.UUID;

public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    EmailVerificationService emailVerificationService;

    public UserServiceImpl(UserRepository userRepository,
                           EmailVerificationService emailVerificationService) {
        this.userRepository = userRepository;
        this.emailVerificationService = emailVerificationService;
    }

    @Override
    public User createUser(String firstName,
                           String lastName,
                           String email,
                           String password,
                           String passwordConfirm) {
        if (firstName == null || firstName.isBlank() || firstName.isEmpty()) {
            throw new IllegalArgumentException("first name is required!");
        }
        if (!password.equals(passwordConfirm)) {
            throw new PasswordNotMatchException("Password and confirm password must be equals!");
        }
        User user = new User(firstName, lastName, email, UUID.randomUUID().toString());


        boolean isUserCreated = false;
        try {
            isUserCreated = userRepository.save(user);
        } catch (RuntimeException ex) {
            throw new UserServiceException(ex.getMessage());
        }

        if (!isUserCreated) {
            throw new UserServiceException("User not created");
        }

        try {
            emailVerificationService.scheduleEmailConfirmation(user);
        } catch (RuntimeException ex) {
            throw new UserServiceException(ex.getMessage());
        }

        return user;
    }
}
