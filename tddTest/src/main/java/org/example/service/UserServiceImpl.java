package org.example.service;

import org.example.model.User;
import org.example.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User createUser(String fristName,
                           String lastName,
                           String emai,
                           String password,
                           String passwordConfirm) {
        return new User();
    }
}
