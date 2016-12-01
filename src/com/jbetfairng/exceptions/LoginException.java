package com.jbetfairng.exceptions;

public class LoginException extends Exception {

    public LoginException(Exception ex) {
        super(ex.getMessage());
    }
}
