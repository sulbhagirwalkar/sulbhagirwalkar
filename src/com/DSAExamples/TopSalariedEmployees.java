package com.DSAExamples;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name, department, role;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
public class TopSalariedEmployees {
    public static void main(String[] args) {
        Employee employees;
        //find average salary of senior software engineer
    /*double avgSalary = employees.stream().filter(e -> e.getDepartment().equals("IT"))
            .filter(e -> e.getRole().equals("Lead developer"))
            .mapToDouble(employees::getSalary)
            .average().orElse(0.0);
    }
    //group employees by department with count


    Map<String, Long> deptCounts = employees.stream()
                                            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

    //find top 3 highest paid employees

    List<Employee> depCount = employee.stream()
                                       .sorted(comparator.comparing(Employee::getSalary).reversed())
                                       .limit(3)
                                       .collect(Collectors.toList());

    List<Employee> deptCount = employees.stream()
                                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                        .limit(3)
                                        .collect(Collectors.toList());

    *///find`
    }
}
