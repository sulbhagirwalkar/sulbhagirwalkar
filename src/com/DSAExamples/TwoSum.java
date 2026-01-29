package com.DSAExamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hasmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (hasmap.containsKey(number)) {
                return new int[]{hasmap.get(number), i};
            }
            hasmap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No match found");
    }

    public static void main(String[] args) {
int[] demoInput = {1, 3, 5, 8, 9 };
int target = 10;
int[] result = twoSum(demoInput, target);
        Arrays.stream(result).forEach(System.out::println);
    }
}