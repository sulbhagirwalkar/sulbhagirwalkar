package com.DSAExamples;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] input = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5};
        long len = Arrays.stream(input).distinct().count();
        System.out.println(len);

    }

}
