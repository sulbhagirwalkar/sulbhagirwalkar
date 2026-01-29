package com.collections;

import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age){}
public class GroupingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", 23),
                new Person("Bob", 30),
                new Person("Charlie", 23),
                new Person("David", 30));
        Map<Integer, List<Person>> grouped = people.stream().collect(Collectors.groupingBy(p -> p.age()));
        grouped.forEach((age, person) -> {
            System.out.println(age + "->" + person.stream().map(p -> p.name()).collect(Collectors.joining(", ")));
        });
    }
}

