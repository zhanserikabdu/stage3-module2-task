package com.mjc.school.service.exceptions;

public class ValidatorException extends RuntimeException{
    public ValidatorException(String message) {
        super(message);
    }
}