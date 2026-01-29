package com.Java8Programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PopularSweet {

    public static void main(String[] args) {
        List<String> sweets = Arrays.asList("MangoBarfi", "Ladu", "Pedha", "Gulabjamun", "Rasmalai", "Rasmalai");

        Map<String, Long> popularSweets = sweets.stream()
                                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


      //  long maxCount =Collectors.max(popularSweets.values());
       /* List<String> mostPopularSweet = popularSweets.entrySet()
                                                     .stream()
                .filter(entry -> entry.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(mostPopularSweet);
*/
        /*

        Map<String, Long> groupedAndToSet = sweets .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        long maxCount = Collections.max(groupedAndToSet.values());

        List<String> mostPopularSweets = groupedAndToSet.entrySet()
                                                        .stream()
                                                        .filter(entry -> entry.getValue() == maxCount)
                                                        .map(Map.Entry::getKey)
                                                        .toList();
        System.out.println("The most popular sweets are:" + mostPopularSweets);
*/
    }
}
