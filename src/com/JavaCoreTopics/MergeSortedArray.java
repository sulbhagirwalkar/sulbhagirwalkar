package com.JavaCoreTopics;

import java.util.Arrays;

public class MergeSortedArray {
    public static int[] merge(int[] num1, int m, int[] num2, int n){
    int[] outputArray = new int[0];
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(num1[i] < num2[j]){
                outputArray[i] = num1[i];
            }else {
                outputArray[j] = num2[j];
            }
        }
     }
    return outputArray;
   }
    public static void main(String[] args) {
        int[]  input1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] input2 = new int[]{2, 5, 6};
        int m =input1.length;
        int n = input2.length;
        System.out.println(Arrays.toString(merge(input1, m, input2, n)));
        System.out.println();
    }
}
