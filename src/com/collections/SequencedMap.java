package com.collections;

import java.util.*;
import java.util.stream.Collectors;


public class SequencedMap {
    List<Employee> employeeList = Arrays.asList(new Employee(1, "Sam", "IT", 250000.0),
            new Employee(2, "Natalie", "Comp", 250000.0),
            new Employee(3, "Bob", "Mech", 50000.0),
            new Employee(4, "Alice", "IT", 250000.0),
            new Employee(5, "Shefali", "HR", 45000.0));



          //
    //  .entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue);

}
