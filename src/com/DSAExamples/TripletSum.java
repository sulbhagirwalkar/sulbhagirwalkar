package com.DSAExamples;

import javax.print.attribute.IntegerSyntax;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public static boolean find_sum_of_three(int[] input, int requiredSum){
    int n = input.length;
    Arrays.sort(input);
    for(int i = 0; i < n - 2; i++){
        int left = i + 1;
        int right = n - 1;
        while(left < right){
            int currentSum = input[i] + input[left] + input[right];
            if(currentSum == requiredSum) {
                return true;
            }else if(currentSum < requiredSum){
                left++;
            }else{
                right--;
            }
        }
    }
        return false;

    }
    public static void main(String[] args) {
int requiredSum = 20;
int[] input = {1,2,4,6,8,10} ;
        System.out.println("result is :" + find_sum_of_three(input, requiredSum));
    }
}
