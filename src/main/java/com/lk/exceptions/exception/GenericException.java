package com.lk.exceptions.exception;

public class GenericException extends RuntimeException {

    public GenericException(int statusCode, String message) {
        super(String.format("Failed for [%s]: %s", statusCode+"", message));
    }
}
