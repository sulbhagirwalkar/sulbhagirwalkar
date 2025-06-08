package com.DSAExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        int[] input = {2,4,5,2,6,8};
       // System.out.println(input);
        //input.stream().distinct().forEach(System.out::println);
    Arrays.stream(input).sorted().forEach(System.out::println);
    }
}
