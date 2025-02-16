package com.insightglobal.day5;

import java.time.LocalDate;

public class StackDemo {
    public static void main(String[] args) {
        Stack contactStack = new Stack();

        // Use LocalDate for birthDate
        Contact contact1 = new Contact("John", "Michael", "Doe", LocalDate.of(1985, 4, 23), "Male", "1234567890");
        Contact contact2 = new Contact("Jane", "", "Smith", LocalDate.of(1990, 7, 14), "Female", "0987654321");
        Contact contact3 = new Contact("Alice", "Marie", "Brown", LocalDate.of(1988, 2, 10), "Female", "1112223333");

        try {
            contactStack.push(contact1);
            contactStack.push(contact2);
            contactStack.push(contact3);
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(contactStack.pop());
            System.out.println(contactStack.pop());
            System.out.println(contactStack.pop());
            // Uncommenting the following line will throw StackUnderflowException
            // System.out.println(contactStack.pop());
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
    