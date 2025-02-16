package com.insightglobal.day5;

public class AverageCalculator {
    
    public double calAverage(int n) {
       
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }
        
        
        double sum = (n * (n + 1)) / 2.0;

       
        return sum / n;
    }

    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();

        try {
           
            System.out.println("Average of first 5 natural numbers: " + calculator.calAverage(5));

            
            System.out.println("Average of first -5 natural numbers: " + calculator.calAverage(-5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

