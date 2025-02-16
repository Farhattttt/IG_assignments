package com.insight.core;

import java.util.Scanner;

public class Prog6 {

   
    public static int calculateWordSum(String str) {
        
        String[] words = str.split(" ");
        
      
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        
       
        if (firstWord.equals(lastWord)) {
           
            return firstWord.length();
        } else {
            
            return firstWord.length() + lastWord.length();
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

       
        int result = calculateWordSum(str);

    
        System.out.println(result);

       
        scanner.close();
    }
}

