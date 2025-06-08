package com.LeetcodeSoloutions;

import static java.util.Collections.reverse;

public class LongestPalindromicSubstring {
    public boolean isPalindrome(String s){
        boolean result = s.toLowerCase().matches(new StringBuilder().reverse().toString());
        return result;
   }
    public  static  String longestPalindrome(String s){

        return null;
    }

    public static void main(String[] args) {
    String str = "abadacbc";
    String  longestSubString = longestPalindrome(str);
    }
}
