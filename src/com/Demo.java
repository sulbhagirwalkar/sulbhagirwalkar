package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//rotate array
public class Demo {

    // expected 4, 5, 1, 2, 3
    //
    /*int output = 9534330;
    int targetNumber ;
    List<String> inputString = Arrays.asList(input).stream().collect(Collectors.toList())
*/
    public  static void rotate(int [] numbers, int start, int end){
        //int[] temp =
    }
    public static void main(String[] args) {
        int [] input = {1, 2, 3, 4, 5};
         //5, 1, 2, 3, 4
        //4, 5, 1, 2, 3
        //3, 4, 5, 1, 2
        for(int i = 0; i < input.length-1; i++){
            int temp = input[i];
            input[i] = input[i+1];
            input[i + 1] = temp;

        }
    }
}
