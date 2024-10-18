package com.matthew.springboot.myfirstwebapp;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    //authenticate the user
    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("matthew");
        boolean isValidPassword = password.equals("password");

        return isValidUserName && isValidPassword;
    }
}
