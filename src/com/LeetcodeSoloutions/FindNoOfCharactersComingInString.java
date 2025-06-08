package com.LeetcodeSoloutions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNoOfCharactersComingInString {
    public static void main(String[] args) {
        String input = "assgbabbbadFgf";

        Map<Character, Long> result = input.chars()
                                           .mapToObj(s -> Character.toLowerCase((char)s))
                                           .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}

