package com.DSAExamples;

public class RotateArray {
    public static int[] reverse(int[] nums, int start, int end ){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

    public static void rotateArray(int[] nums, int k){
        k %= nums.length;
      //  k = 3;
    reverse(nums, 0, nums.length-1);
    reverse(nums, 0,  k-1);
    reverse(nums,   k,nums.length-1 );
    }

    public static void main(String[] args) {

    int[] input = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
       int[] result = reverse(input, 0, input.length-1 );
        for(int i = 0; i < result.length;i++){
            System.out.print(input[i] + " ");

        }
    }
}
