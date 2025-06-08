package com.LeetcodeSoloutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondLArgentElementInAGIvenList {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10,20,35,50, 50,75,65);
        Optional< Integer> result = input.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(result.get());
    }
}
