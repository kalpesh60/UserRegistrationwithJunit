package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String namePattern = "^[A-Z]{1}[a-zA-Z]{3,}";
    private static final String passwordPattern = "^[A-Z]{1}[a-zA-Z]{3,}";
    private static final String emailPattern = "^[A-Z]{1}[a-zA-Z]{3,}";
    private static final String phoneNoPattern = "^[0-9]{2}\\s{1}[0-9]{10}$";

    public boolean firstNameValidation(String firstname) {
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(firstname).matches();
    }
    
    public boolean lastNameValidation(String lastname) {
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(lastname).matches();
    }

    public boolean emailValidation(String email) {
        Pattern pattern = Pattern.compile(emailPattern);
        return pattern.matcher(email).matches();
    }

    public boolean phoneNoValidation(String phonenumber) {
        Pattern pattern = Pattern.compile(emailPattern);
        return pattern.matcher(phonenumber).matches();
    }
}
