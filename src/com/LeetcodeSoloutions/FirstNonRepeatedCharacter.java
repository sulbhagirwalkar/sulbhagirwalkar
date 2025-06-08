package com.LeetcodeSoloutions;


/**
 * Java program to find the first non-repeated character in a string
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNonRepeatedCharacter {

    public static char findFirstNonRepeatedCharacter(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry :map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        //populate the map with character count
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch ,0)+1);
        }

        // find the first non-repeated character
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedCharacter(input);
        System.out.println(result);
    }
}
