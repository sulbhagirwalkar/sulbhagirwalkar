package DSABAsics.SlidingWindowProblems;

import java.io.FilterOutputStream;

public class Demo1 {
    public static int[] rotate(int[] nums, int k){

        if(k > nums.length)
            k = k % nums.length;
        System.out.println(k);

        int [] result = new int[nums.length];

        for (int i = 0; i < k; i++){
            result[i] = nums[nums.length - k+i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(rotate(input,k).toString());
    }
}
