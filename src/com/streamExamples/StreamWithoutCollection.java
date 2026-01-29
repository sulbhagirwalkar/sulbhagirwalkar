package com.streamExamples;

import java.util.stream.Stream;

/**
* Stream can be generated dynamically using Stream.generate()
* or Stream.iterate() for infinite or finite sequences
* */
public class StreamWithoutCollection {
    public static void main(String[] args) {
        //Generate an infinite stream of random numbers
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        randomNumbers.forEach(System.out::println);
        //create a finite stream using iterate
        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1).limit(10);
        numbers.forEach(System.out::println);
    }
}
