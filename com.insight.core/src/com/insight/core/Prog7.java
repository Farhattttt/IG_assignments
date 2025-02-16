package com.insight.core;

import java.util.Scanner;

public class Prog7 {

   
    public static String convertFormat(String number) {
       
        String digits = number.replace("-", "");

        
        if (digits.length() != 10) {
            return "Invalid input, the number should be exactly 10 digits.";
        }

        
        String formattedNumber = digits.substring(0, 2) + "-" +
                                 digits.substring(2, 4) + "-" +
                                 digits.substring(4, 7) + "-" +
                                 digits.substring(7, 10);

        return formattedNumber;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a 10-digit number (format XXX-XXX-XXXX): ");
        String number = scanner.nextLine();

       
        String result = convertFormat(number);

       
        System.out.println("Formatted Number: " + result);

        
        scanner.close();
    }
}

