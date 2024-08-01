package com.example.demo.service;

public class ErrorGenerico extends Exception {

    public ErrorGenerico(String message, Throwable cause) {
        super(message, cause);
    }
}
