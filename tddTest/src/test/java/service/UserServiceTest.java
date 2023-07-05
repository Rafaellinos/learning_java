package service;

import org.example.model.User;
import org.example.model.exception.PasswordNotMatchException;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl();
    }

    @Test
    @DisplayName("Create User with details")
    void testCreateUser_whenUserDetailsProvided_returnUserObject() {
        // arrange
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
        assertNotNull(user, () -> "User not created");

    }

    @Test
    void testCreateUser_whenUserCreate_returnUserWithFirstName() {
        // Arrange
        String firstName = "Rafael";
        String lastName = "Veloso";
        String email = "rafael@email.com";
        String password = "rafael@123";
        String passwordConfirmation = "rafael@123";

        // Act
        User user = userService.createUser(
                firstName,
                lastName,
                email,
                password,
                passwordConfirmation
        );

        // Assert
        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(email, user.getEmail());
        assertNotNull(user.getId());
    }

    @Test
    @DisplayName("User with empty first name")
    void testCreateUser_whenAttemptToCreateUserFirstNameEmpty_throwIllegalArgumentException() {
        // Arrange
        String firstName = "";
        String lastName = "Veloso";
        String email = "rafael@email.com";
        String password = "rafael@123";
        String passwordConfirmation = "rafael@123";

        // Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            userService.createUser(
                    firstName,
                    lastName,
                    email,
                    password,
                    passwordConfirmation
            );
        }, "For empty first name, illegal argumento should be thrown");
        assertEquals(thrown.getMessage(), "first name is required!");
    }

    @Test
    void testCreateUser_whenCreateUserWithDiffPasswords_throwPasswordNotMatchException() {
        // Arrange
        String firstName = "Rafael";
        String lastName = "Veloso";
        String email = "rafael@email.com";
        String password = "rafael@1234";
        String passwordConfirmation = "rafael@123";

        // Act & Assert
        PasswordNotMatchException thrown = assertThrows(PasswordNotMatchException.class, () -> {
            userService.createUser(
                    firstName,
                    lastName,
                    email,
                    password,
                    passwordConfirmation
            );
        }, "Password and password confirm with different strings should throw exception!");
        assertEquals(thrown.getMessage(), "Password and confirm password must be equals!");
    }
}
