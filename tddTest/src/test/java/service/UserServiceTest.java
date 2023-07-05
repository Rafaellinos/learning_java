package service;

import org.example.model.User;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    @DisplayName("Create User with details")
    void testCreateUser_whenUserDetailsProvided_returnUserObject() {
        // arrange
        UserService userService = new UserServiceImpl();
        String firstName = "Rafael";
        String lastName = "Veloso";
        String email = "rafael@email.com";
        String password = "rafael@123";
        String passwordConfirmation = "rafael@123";

        // act
        User user = userService.createUser(
                firstName,
                lastName,
                email,
                password,
                passwordConfirmation
        );

        // assert
        assertNotNull(user);

    }
}
