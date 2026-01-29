package com.javaStreams;

import java.util.Arrays;
import java.util.stream.Stream;

/*
* In java, the stream API introduced in Java 8 primarily designed to work
* with collections, arrays, or I/O channels. However, it is possible to stream data without directly relying on collection by using other sources such as arrays, files, or custom generators. Below are some approaches to achieve this;
* Using Arrays as a stream source
* */
public class StreamFromArray {
    public static String printingData(String[] input) {
        String[] data = {"Java", "Stream", "API", "Example"};
        //Create a stream from an array

        Stream<String> stream = Arrays.stream(data);

        //perform operation on stream
        stream.filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        return stream.toString();
    }

    public static void main(String[] args) {
        String[] demo = {"Java", "Stream", "API", "Example"};
        printingData(demo);
    }

}