package com.Java8Programs;

import java.util.Hashtable;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * find the frequency of each character in a given string */


public class FrequencyOfEachCharacter {

    public static void main(String[] args) {
    String input = "Hello world";

    // step pne is to convert string to stream of characters
        Map<Character, Long> characterFrequency = input.chars()
                                                       .filter(c -> c != ' ')
                                                       .mapToObj(c -> (char) c)
                                                       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //step 3 display the frequency of each character

        characterFrequency.forEach((character, frequency) ->
        System.out.println("' "+ character + " '->"+ frequency));

    }
}
