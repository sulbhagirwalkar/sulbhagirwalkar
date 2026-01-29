package com.DSAExamples;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
    public static int longestSubstring(String demo) {
        demo = "abcdedcf";
        int maxCount = 0;
        HashSet<Character> map = new HashSet<>();
        int leftPointer = 0;
        int nextPointer = 0;
        while( nextPointer < demo.length() -1){
            if(map.contains(demo.charAt(nextPointer))){
                map.add(demo.charAt(nextPointer));
                nextPointer++;
                maxCount = Math.max(maxCount, map.size());
            }else{
                map.remove(demo.charAt(leftPointer));
                leftPointer++;
            }
        }

    return maxCount;
    }

        /*
        HashSet<Character> inputString = new HashSet<>();
        int leftPointer = 0;
        int nextPointer = 0;
        int MaxCount = 0;
        while(nextPointer < demo.length() -1){
            if(! inputString.contains(demo.charAt(nextPointer))){
                inputString.add(demo.charAt(nextPointer));
                nextPointer++;
                MaxCount = Math.max(inputString.size(), MaxCount);
            }else{
                inputString.remove(demo.charAt(leftPointer));
                leftPointer++;
            }
        }
        return MaxCount;
    }*/
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcdedef"));
    }
}
