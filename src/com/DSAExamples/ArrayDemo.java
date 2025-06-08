package com.DSAExamples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 8, 11, 3, 21};
       int[] result = Arrays.stream(numbers).sorted().toArray();
        for (int num : result) {
            System.out.println(num + " ");

        }
    }
}
