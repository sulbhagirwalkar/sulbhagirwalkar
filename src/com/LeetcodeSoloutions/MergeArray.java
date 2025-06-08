package com.LeetcodeSoloutions;

import java.util.Arrays;

public class MergeArray {
    public static int[] merge(int[] nums1, int m, int[] num2, int n){

        for(int i = 0; i < n-1; i++ ){
                nums1[m- nums1.length] = num2[i];
            }
        System.out.println(nums1);
        return nums1;
        }


    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 0, 0, 0};
        System.out.println(Arrays.toString(input1));
        int[] input2 = {2,4,7};
        int m = 6;
        int n = 3;
       int[] output = merge(input1, m, input2, n);
       System.out.println(Arrays.toString(output));
    }
}
