package com.insight.core;

import java.util.Scanner;

public class Prog4 {

   
    public static String reshape(String str, char separator) {
       
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        
        
        StringBuilder finalString = new StringBuilder();
        
        for (int i = 0; i < reversed.length(); i++) {
            finalString.append(reversed.charAt(i));
            
            if (i < reversed.length() - 1) {
                finalString.append(separator);
            }
        }
        
        return finalString.toString();
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

       
        System.out.print("Enter a character: ");
        char separator = scanner.next().charAt(0);

        
        String result = reshape(str, separator);

       
        System.out.println("Formatted String: " + result);

     
        scanner.close();
    }
}

