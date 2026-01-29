package com.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TopSalariedEmployees {
    public static void main(String[] args) {
        record Employee(Integer id, String name, Double salary){}
        List<Employee> employeeList = Arrays.asList(new Employee(1, "Sulbha", 250000.0),
                                                    new Employee(2, "Rama",  300000.0),
                                                    new Employee(3, "Sam",  500000.0),
                                                    new Employee(4, "Dho",  504000.0),
                                                    new Employee(5, "Ali",  50000.0));

       List<Employee> result = employeeList.stream()
                                            .sorted(Comparator.comparing(Employee::salary)
                                            .reversed())
                                            .limit(3)
                                            .toList();
        System.out.println(result);
    }
}
