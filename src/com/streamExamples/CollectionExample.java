package com.streamExamples;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Sulbha", "IT", 45000.0),
                (new Employee(2, "Abha", " Computer", 50000.0)),
                (new Employee(3, "Bob", "Mech", 57000.0)),
                (new Employee(4, "Ana", "IT", 45000.0))

            //    List<Employee> Emp = Arrays.asList(new Employee());

        );
//find the employees whose name starts with A
       // employees.add(new Employee(5, "Sam", "It", (double) 20000.0));
        List<Employee> sortEmp = employees.stream().filter(Employee -> Employee.getName().startsWith("A")).toList();

        Optional<Double> highestPaidEmp = employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).findFirst();


        List<Employee> sortedEmployees = employees.stream().filter(e -> e.getName().startsWith("A")).toList();
        System.out.println(sortedEmployees);

        List<Employee> srt = employees.stream()
                .sorted(Comparator.comparing(Employee::getName)
                .thenComparing(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())))
                .toList();

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toSet());



     /*  Map<Integer, String> dem1 = employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
                                .forEach(System.out::println);

       List<String> sweets = employees.stream()
                                      .collect(Collectors.groupingBy(Employee::getName), 


                                        System.out.println("srt");
        srt.forEach(System.out::Pritln);
*/


//Find the highest salaried employee from a list.
        Optional<Double> highlyPaidEmployee = employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(highlyPaidEmployee);
    //Return a Map with ID as key and salary as value from list of employees


List<String> words = Arrays.asList("apple", "banana", "apricot", "berry", "cat" );

//grouping by the first letter
        Map<Character,List<String>> groupedByFirstLetter = words.stream()
                                                                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(groupedByFirstLetter);
    }
}