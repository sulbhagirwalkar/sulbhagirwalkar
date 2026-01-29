package com.DSAExamples;

import java.util.HashMap;
import java.util.Map;

public class TwoDArrayDemo {
    static int [][] number1;
    static int [][] number2;
    static int targetSum;
    static int result;
    static int counter = 0;
    public static int getTargetSum(int[][] num1, int[][] num2){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < number1.length; i++){
            for(int j = 0; j < number2.length; j++){
                number2[i][j] = targetSum - number1[i][j];
                if(map.containsKey(number2[i][j])){
                    counter++;
                }else {
                    map.put(number2[i][j], counter);
                    i++;
                    j++;
                }
            }
        }

    return counter;
    }
    public static void main(String[] args) {
        int [] [] input ={{10, 20, 21},{20, 24, 11} ,{20, 31, 22}};
        int [][] input1 = {{11, 8, 9}, {6,11,21},{20,30,22}};
        System.out.println(getTargetSum(input, input1));
    }
}
