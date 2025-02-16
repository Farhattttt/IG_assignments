package com.insight.core;

import java.util.Scanner;

public class Prog3 {

    
    public static boolean validatePAN(String pan) {
        
        if (pan.length() != 8) {
            return false;
        }

        
        if (!pan.substring(0, 3).matches("[A-Z]{3}")) {
            return false;
        }

        
        if (!pan.substring(3, 7).matches("[0-9]{4}")) {
            return false;
        }

       
        if (!pan.substring(7).matches("[A-Z]")) {
            return false;
        }

       
        return true;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the PAN number: ");
        String pan = scanner.nextLine();

        
        if (validatePAN(pan)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

      
        scanner.close();
    }
}

