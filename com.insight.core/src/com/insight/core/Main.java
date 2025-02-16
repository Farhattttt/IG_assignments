package com.insight.core;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
     
        Address address1 = new Address("123 Main St", "New York", "NY", "10001");
        Address address2 = new Address("456 Elm St", "Los Angeles", "CA", "90001");
        Address address3 = new Address("123 Main St", "New York", "NY", "10001");

     
        Student student1 = new Student("John", "Doe", 20, address1);
        Student student2 = new Student("Jane", "Doe", 22, address2);
        Student student3 = new Student("John", "Doe", 20, address3); 

        
        HashSet<Student> students = new HashSet<>();
        
       
        students.add(student1);
        students.add(student2);
        students.add(student3);

        
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
