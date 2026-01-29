package com.DSAExamples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
* Given a string s, find the length of the longest substring without duplicate characters.
    public int lengthOfLongestSubstring(String s) {
}
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashset = new HashSet<>();

        int leftPointer = 0;
        int nextPointer = 0;
        int maxCount = 0;
        while(nextPointer < s.length()){
            if(!hashset.contains(s.charAt(nextPointer))){
                hashset.add(s.charAt(nextPointer));
                nextPointer++;
                maxCount = Math.max(hashset.size(), maxCount);
                }else{
                hashset.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }
        return maxCount;

    }
        public static void main(String[] args) {
        String s1 = "abcabcbb";
            System.out.println(lengthOfLongestSubstring(s1));
    }
}
