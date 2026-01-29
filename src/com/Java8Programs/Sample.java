package com.Java8Programs;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // looping through and printing values use external iterator

        numbers.forEach(System.out::println);
/*

        //imperative style
        int result = 0;
        for(int e : numbers){
            if( e % 2 == 0){
                result += e + 2;
           }
            System.out.println(result);
        }
*/
        Integer result =    numbers.stream()
                                   .filter(e -> e % 2 == 0)
                                   .map(e -> e * 2)
                                   .reduce(0, Integer::sum);
        System.out.println(result);
    }
}
