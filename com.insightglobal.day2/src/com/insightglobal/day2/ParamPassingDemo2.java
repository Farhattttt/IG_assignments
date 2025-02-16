package com.insightglobal.day2;

public class ParamPassingDemo2 {

   
    public void swap(int a, int b) {
        System.out.println("Before swap (integers): a = " + a + ", b = " + b);
        
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swap (integers): a = " + a + ", b = " + b);
    }

    
    public void swap(int[] array1, int[] array2) {
        System.out.println("Before swap (arrays):");
        System.out.print("Array1: ");
        printArray(array1);
        System.out.print("Array2: ");
        printArray(array2);
        
       
        int[] temp = array1;
        array1 = array2;
        array2 = temp;

        System.out.println("After swap (arrays):");
        System.out.print("Array1: ");
        printArray(array1);
        System.out.print("Array2: ");
        printArray(array2);
    }

   
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ParamPassingDemo2 demo = new ParamPassingDemo2();

      
        int x = 10;
        int y = 20;
        System.out.println("Before calling swap(int, int):");
        System.out.println("x = " + x + ", y = " + y);
        demo.swap(x, y);
        System.out.println("After calling swap(int, int):");
        System.out.println("x = " + x + ", y = " + y); 

      
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println("\nBefore calling swap(int[], int[]):");
        System.out.print("Array1: ");
        demo.printArray(array1);
        System.out.print("Array2: ");
        demo.printArray(array2);
        demo.swap(array1, array2);
        System.out.println("After calling swap(int[], int[]):");
        System.out.print("Array1: ");
        demo.printArray(array1);  
        System.out.print("Array2: ");
        demo.printArray(array2);  
    }
}
