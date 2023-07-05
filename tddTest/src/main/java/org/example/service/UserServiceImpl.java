package org.example.service;

import org.example.model.User;
import org.example.model.exception.PasswordNotMatchException;

import java.util.UUID;

public class UserServiceImpl implements UserService {

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
        return new User(
                firstName,
                lastName,
                email,
                UUID.randomUUID().toString()
        );
    }
}
