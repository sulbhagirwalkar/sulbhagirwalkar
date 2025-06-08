package com.streamExamples;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        long startTime = 0;
        long endTime = 0;
        startTime = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("plain stream took time :"+ (endTime-startTime));

        System.out.println("------------------------");


        startTime = System.currentTimeMillis();
        IntStream.range(1, 100).parallel().forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("parallet stream took time: "+ (endTime + startTime));

    }
}
