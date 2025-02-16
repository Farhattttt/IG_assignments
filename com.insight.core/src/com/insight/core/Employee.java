package com.insight.core;

import java.util.*;

public class Employee implements Comparable<Employee> {
    private int empid;
    private String firstname;
    private String lastname;

   
    public Employee(int empid, String firstname, String lastname) {
        this.empid = empid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    
    public int getEmpid() {
        return empid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return empid == employee.empid; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid); 
    }

   
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.empid, other.empid);
    }


    @Override
    public String toString() {
        return "Employee[empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + "]";
    }
}


class SortByFirstname implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getFirstname().compareTo(e2.getFirstname());
    }
}
