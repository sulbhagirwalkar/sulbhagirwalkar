package com.Java8Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class FindMaxAndMinNumberInAList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 22, 9, 12);


        OptionalInt minNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .min();
        OptionalInt maxNumber = numbers.stream()
                                        .mapToInt(Integer::intValue)
                                        .max();
    //Display the maximum and minimum numbers
        maxNumber.ifPresent(max -> System.out.println("Maximum number: "+ max));
        minNumber.ifPresent(min -> System.out.println("Minimum number:" + min));
    }

}

