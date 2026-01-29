package com.Sample;

import com.streamExamples.Employee;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        Employee[] employeesList = new Employee[4];
        employeesList[0]= new Employee(1,"Sulbha", "IT", 7000.0);
        employeesList[1]= new Employee(2,"ALi", "IT", 5000.0);
        employeesList[2]= new Employee(3,"Rohan", "IT", 70100.0);
        employeesList[3]= new Employee(4,"Pradnya", "IT", 10000.0);
        System.out.println("before sort"+ Arrays.toString(employeesList));
        EmployeeList employeeList= new EmployeeList();
        Arrays.sort(employeesList, employeeList);
    }
}
