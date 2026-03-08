package com.pm.patientservice.exception;

public class EmailAlreadyExsitsException extends RuntimeException {
    public EmailAlreadyExsitsException(String message) {
        super(message);
    }
}
