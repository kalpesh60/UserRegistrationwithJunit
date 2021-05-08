package com.userregistration;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String namePattern = "^[A-Z]{1}[a-zA-Z]{3,}";
    private static final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%*]{1})(?=.*[a-z]){8,}.*";
    private static final String emailPattern = "(^[A-Za-z0-9]{1,}[-+_.]{0,1})[A-Za-z0-9]{0,}[@]{1}[A-Za-z0-9]{1,}[.]{1}[A-Za-z]{2,3}[.]{0,1}[A-Za-z]{0,3}";
    private static final String phoneNoPattern = "^[0-9]{2}\\s{1}[0-9]{10}$";

    public boolean firstNameValidation(String firstname) throws UserRegistrationException {
        boolean result = Pattern.compile(namePattern).matcher(firstname).matches();
        if(result) {
            System.out.println("name is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("name is not valid");
        }
    }

    public boolean lastNameValidation(String lastname) throws UserRegistrationException {
        boolean result = Pattern.compile(namePattern).matcher(lastname).matches();
        if(result) {
            System.out.println("Last name is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("lastname is not valid");
        }
    }

    public static boolean emailValidation(String email) throws UserRegistrationException {
        boolean result = Pattern.compile(emailPattern).matcher(email).matches();
        if(result) {
            System.out.println("email is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("email is not valid");
        }
    }

    public boolean phoneNoValidation(String phonenumber) throws UserRegistrationException {
        boolean result = Pattern.compile(phoneNoPattern).matcher(phonenumber).matches();
        if(result) {
            System.out.println("phone number is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("phone no is not valid");
        }
    }

    public boolean passwordValidation(String password) throws UserRegistrationException {
        boolean result = Pattern.compile(passwordPattern).matcher(password).matches();
        if(result) {
            System.out.println("password is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("password is not valid");
        }
    }
}
