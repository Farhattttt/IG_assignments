package com.insight.core;

import java.util.Scanner;

public class Prog5 {

    
    public static String getLastLetter(String sentence) {
        String[] words = sentence.split(" "); 
        StringBuilder result = new StringBuilder(); 

        for (String word : words) {
            if (!word.isEmpty()) {
                
                result.append(Character.toUpperCase(word.charAt(word.length() - 1)));
            }
        }

        return result.toString(); 
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

       
        String result = getLastLetter(sentence);

     
        System.out.println("Resulting String: " + result);

        
        scanner.close();
    }
}

