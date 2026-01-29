package com.HackerrankProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNoOfGroupsInArray {
    public static int minimumGroups(List<Integer> arr, int limit){
        int[] numbers = arr.stream().mapToInt(i -> i).toArray();
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length -1;
        int groups = 0;
        while(left <= right){
            if(numbers[left] + numbers[right] <= limit){
                left++;
            }
            right--;
            groups++;
        }
        return groups;
    }
    public static void main(String[] args) {
    List<Integer> arr1 = Arrays.asList(2, 3, 7, 9);
    int limit = 9;
    System.out.println(minimumGroups(arr1,limit));
    }

}
