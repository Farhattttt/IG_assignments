package com.insightglobal.day5;

import java.time.LocalDate;
import java.util.EmptyStackException;


public class Contact {
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private String phoneNumber;

    public Contact(String firstName, String middleName, String lastName, LocalDate birthDate, String gender, String phoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact: " + firstName + " " + middleName + " " + lastName + ", Birthdate: " + birthDate + ", Gender: " + gender + ", Phone: " + phoneNumber;
    }
}

class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends EmptyStackException {
    public StackUnderflowException(String message) {
        super();
        System.out.println(message);
    }
}