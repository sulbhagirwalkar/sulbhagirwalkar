package com.Java8Programs;

import com.sun.jdi.Value;

import java.util.Arrays;

public class StringToInteger {

       public static void main(String[] args) {
           String str = "223";
           String[] input = str.split("");
        int[] result = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
           System.out.println();

    }


}
