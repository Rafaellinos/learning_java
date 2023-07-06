package org.example.model.exception;

public class EmailVerificationServiceException extends RuntimeException {
    public EmailVerificationServiceException(String message) {
        super(message);
    }
}
