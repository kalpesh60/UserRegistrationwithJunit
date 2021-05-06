package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String firstNamePattern = "^[A-Z]{1}[a-zA-Z]{3,}";
    private static final String lastNamePattern = "^[A-Z]{1}[a-zA-Z]{3,}";
    private static final String passwordPattern = "^[A-Z]{1}[a-zA-Z]{3,}";
    private static final String emailPattern = "^[A-Z]{1}[a-zA-Z]{3,}";

    public boolean firstNameValidation(String firstname) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        return pattern.matcher(firstname).matches();
    }
}
