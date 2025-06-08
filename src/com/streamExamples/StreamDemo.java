package com.streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Java streams, introduced in Java8. provide a powerful way to process collections
 * of objects in a declarative and functional style. A stream represents a sequence of
 * elements that supports various operations, which can be pipelined to produce the desired result.
 * streams do not store data; instead, they operate on a source sucha as a collection, array,
 * or I/O channel, and produce a result without modifying the original source
 * core concepts
 * Stream pipeline:
 * Intermediate operations: filter, map, sorted, limit
 * Terminal operations: produce a result forEach, count, collect, min, max, reduce, and toArray-
 * Terminal operation trigger the execution of stream pipeline
 * */
public class StreamDemo {
    public static void main(String[] args) {
        //create streams using collections

       // List<String> list = Arrays.asList("a", "b", "c");
       // Stream<String> stream = list.stream();
        //Stream<String> parallelStream = list.parallelStream();

        //common Stream operations: filtering: select elements that matches the predicate

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //common Stream operations: Mapping: Transform element to another type

        List<String> names = Arrays.asList("Alice", "bob", "Charlie");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //common Stream operations: Sorting: Sort elements in natural order or using comparator
        List<Integer> numbers1 = Arrays.asList(5, 2, 4, 1, 3);
        numbers1.stream()
                .sorted()
                .forEach(System.out::println);

        //common Stream operations: Limiting : Reduce the stream to a specified number of elements

        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        //common Stream operations: Collecting: gather elements into a collection or summary result

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // common Stream operations: Matching: Check if element math a predicate
            boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0); //true
            boolean allPositive = numbers.stream().allMatch(n -> n > 0); //true
            boolean nonNegative = numbers.stream().noneMatch(n -> n < 0); //true

        //common Stream operations: Finding Retrieve an element that matches a criteria

        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        Optional<Integer> anyEven1 = numbers.stream().filter(n -> n % 2 == 0).findAny();

        //common Stream operations: Reducing combine elements using a binary operation

        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
    }

}
