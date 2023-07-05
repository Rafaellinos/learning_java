package org.example.service;

import org.example.model.User;

public interface UserService {

    User createUser(String fristName,
                    String lastName,
                    String emai,
                    String password,
                    String passwordConfirm);
}
