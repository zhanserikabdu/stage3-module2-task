package com.mjc.school.service.exceptions;

import lombok.Getter;

@Getter
public class ErrorNotification {
    private final StringBuilder errorList;

    public ErrorNotification() {
        errorList = new StringBuilder();
    }

    public void addError(String error) {
        errorList.append(error).append("\n");
    }

    public boolean hasErrors() {
        return errorList.length() != 0;
    }
}

