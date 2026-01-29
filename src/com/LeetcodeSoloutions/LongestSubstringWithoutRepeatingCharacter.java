package com.LeetcodeSoloutions;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> hashSet = new HashSet<>();
        int leftPointer = 0;
        int nextPointer = 0;
        int maxCount = 0;
        while(nextPointer < s.length()){
            if(!hashSet.contains(s.charAt(nextPointer))){
                hashSet.add(s.charAt(nextPointer));
                nextPointer++;
                maxCount = Math.max(hashSet.size(), maxCount);
            }else {
                hashSet.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String input = "pwwkew";
        System.out.println(lengthOfLongestSubstring(input));
    }
}
