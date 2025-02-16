package com.insight.core;

import java.util.*;

public class EmployeeManagement {

    public Set<Employee> createEmployeeSet() {
        Set<Employee> employeeSet = new TreeSet<>();  
        

        employeeSet.add(new Employee(101, "John", "Doe"));
        employeeSet.add(new Employee(102, "Alice", "Smith"));
        employeeSet.add(new Employee(103, "Bob", "Johnson"));
        employeeSet.add(new Employee(104, "Charlie", "Brown"));
        employeeSet.add(new Employee(105, "David", "Davis"));
        employeeSet.add(new Employee(106, "Eve", "Taylor"));
        
        return employeeSet;
    }

    
    public void sortByEmpid(Set<Employee> employeeSet) {
        System.out.println("\nEmployees sorted by empid:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }


    public void sortByFirstname(Set<Employee> employeeSet) {
        List<Employee> employeeList = new ArrayList<>(employeeSet);
        Collections.sort(employeeList, new SortByFirstname());

        System.out.println("\nEmployees sorted by firstname:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }


    public static void main(String[] args) {
        EmployeeManagement manager = new EmployeeManagement();
        
   
        Set<Employee> employeeSet = manager.createEmployeeSet();

       
        manager.sortByEmpid(employeeSet);

   
        manager.sortByFirstname(employeeSet);
    }
}
