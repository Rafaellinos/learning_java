package service;

import org.example.data.UserRepository;
import org.example.model.User;
import org.example.model.exception.EmailVerificationServiceException;
import org.example.model.exception.PasswordNotMatchException;
import org.example.model.exception.UserServiceException;
import org.example.service.EmailVerificationServiceImpl;
import org.example.service.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    UserServiceImpl userService; // must be real implementation

    @Mock
    UserRepository userRepository;

    @Mock
    EmailVerificationServiceImpl emailVerificationService;

//    @BeforeEach
//    void setUp() {
//        userService = new UserServiceImpl();
//    }

    @Test
    @DisplayName("Create User with details")
    void testCreateUser_whenUserDetailsProvided_returnUserObject() {
        // arrange
        Mockito.when(userRepository.save(Mockito.any(User.class))).thenReturn(true);
        Mockito.doNothing().when(emailVerificationService).scheduleEmailConfirmation(Mockito.any(User.class));

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
        Mockito.verify(userRepository, Mockito.times(1)) // 1 is default so it's not necessary
                .save(Mockito.any(User.class));

    }

    @Test
    void testCreateUser_whenUserCreate_returnUserWithFirstName() {
        // Arrange
        Mockito.when(userRepository.save(Mockito.any(User.class))).thenReturn(true);
        Mockito.doNothing().when(emailVerificationService).scheduleEmailConfirmation(Mockito.any(User.class));
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

    @Test
    void testCreateUser_whenRepositoryRunTimeException_throwUserServiceException() {
        // Arrange
        Mockito.when(userRepository.save(Mockito.any(User.class))).thenThrow(RuntimeException.class);
        String firstName = "Rafael";
        String lastName = "Veloso";
        String email = "rafael@email.com";
        String password = "rafael@123";
        String passwordConfirmation = "rafael@123";

        // Act & Assert
        UserServiceException userServiceException = assertThrows(UserServiceException.class, () -> {
            userService.createUser(
                    firstName,
                    lastName,
                    email,
                    password,
                    passwordConfirmation
            );
        }, "UserServiceException should have thrown");
        assertNull(userServiceException.getMessage());
    }

    @Test
    @DisplayName("Email verification exception")
    void testCreateUser_whenEmailVerificationServiceExceptionThrown_throwUserServiceException() {
        // arrange
        Mockito.when(userRepository.save(Mockito.any(User.class))).thenReturn(true);
        Mockito.doThrow(EmailVerificationServiceException.class)
                .when(emailVerificationService).scheduleEmailConfirmation(Mockito.any(User.class));
        String firstName = "Rafael";
        String lastName = "Veloso";
        String email = "rafael@email.com";
        String password = "rafael@123";
        String passwordConfirmation = "rafael@123";

        // act & assert
        assertThrows(UserServiceException.class, () -> {
            userService.createUser(
                    firstName,
                    lastName,
                    email,
                    password,
                    passwordConfirmation
            );
        }, "UserServiceException should have thrown for email error");
        Mockito.verify(emailVerificationService).scheduleEmailConfirmation(Mockito.any(User.class));
    }
}
