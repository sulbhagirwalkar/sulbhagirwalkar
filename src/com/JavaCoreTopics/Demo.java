package com.JavaCoreTopics;

import java.util.Arrays;

public class Demo {

    public static int removeElement(int[] nums, int val) {
        // nums =[0, 1, 2, 2, 3, 0, 4, 2], val =2
        //desired output= count 5, nums = [sorted array]
        int resultingArray = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                resultingArray = nums[i];
                resultingArray++;
            }
        }
        return resultingArray;
    }

    public static void main(String[] args) {
        int[] input ={0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(input, 2));
    }
}
