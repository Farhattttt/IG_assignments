package com.insightglobal.day2;

public class ParamPassingDemo1 {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "John");

        // Print initial data
        System.out.println("Before calling modify() methods:");
        System.out.println("Student rollno: " + student.rollno);
        System.out.println("Student fname: " + student.fname);

        // Test passing primitive data type
        int number = 5;
        System.out.println("Before modify(int): number = " + number);
        student.modify(number); // Pass primitive int
        System.out.println("After modify(int): number = " + number);

        // Test passing User Defined class
        System.out.println("Before modify(Student): rollno = " + student.rollno);
        student.modify(student); // Pass Student object
        System.out.println("After modify(Student): rollno = " + student.rollno);

        // Test passing String
        System.out.println("Before modify(String): fname = " + student.fname);
        student.modify(student.fname); // Pass String
        System.out.println("After modify(String): fname = " + student.fname);
    }
}

//User-defined class Student
class Student {
 int rollno;
 String fname;

 // Constructor to initialize attributes
 public Student(int rollno, String fname) {
     this.rollno = rollno;
     this.fname = fname;
 }

 // Method 1: modify() that accepts a primitive int
 public void modify(int number) {
     number = number + 1; // Increment number by 1
     System.out.println("Inside modify(int): number = " + number);
 }

 // Method 2: modify() that accepts a Student object
 public void modify(Student student) {
     student.rollno = student.rollno + 1; // Increment rollno by 1
     System.out.println("Inside modify(Student): rollno = " + student.rollno);
 }

 // Method 3: modify() that accepts a String
 public void modify(String fname) {
     this.fname = "New Name"; // Change fname to "New Name"
     System.out.println("Inside modify(String): fname = " + this.fname);
 }
}


