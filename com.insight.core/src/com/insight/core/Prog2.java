package com.insight.core;

import java.util.Scanner;

public class Prog2 {

	public static Integer findMaxDistance(int[] arr, int n) {
        
        if (n < 2) {
            return null;
        }

        int maxDiff = 0;
        int index = -1;


        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]); 

         
            if (diff > maxDiff) {
                maxDiff = diff;

                
                if (arr[i] > arr[i + 1]) {
                    index = i;
                } else {
                    index = i + 1;
                }
            }
        }

       
        return index;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] arr = new int[n];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        Integer index = findMaxDistance(arr, n);

      
        System.out.println("Index of the larger number in the largest difference pair: " + index);

        
        scanner.close();
    }

}
