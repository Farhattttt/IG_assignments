package com.insight.core;

import java.util.Scanner;

public class Prog1 {

	public static String getCapitalized(String sentence) {
        String[] words = sentence.split(" "); 
        StringBuilder capitalizedSentence = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 0) {
                
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                                    .append(word.substring(1)).append(" ");
            }
        }
        

        return capitalizedSentence.toString().trim();
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        String result = getCapitalized(sentence);
        
        
        System.out.println("Capitalized Sentence: " + result);
        
        
        scanner.close();
    }

}
