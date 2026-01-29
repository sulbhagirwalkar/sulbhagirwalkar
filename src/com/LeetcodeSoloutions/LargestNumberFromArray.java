package com.LeetcodeSoloutions;

import java.util.Arrays;

public class LargestNumberFromArray {
    public static String formLargestNumber(int[] nums) {
    int[] input = {3, 30, 34, 5, 9};



    String[] demo = Arrays.stream(input).mapToObj(String::valueOf).toArray(String[]::new);

    Arrays.sort(demo, (a,b) -> {return (a + b).compareTo(b + a);});
    if(demo[0].equals("0")) return "0";
        String join = String.join("", demo);
        return join;
    }
}
    //find the largest possible number from the above array
    /*
        String[] strNums = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(strNums, (a, b) -> {
            return (b + a).compareTo(a + b);//
        });
      if(strNums[0].equals("0")) return "0";
        String join = String.join("", strNums);
        return join;
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(formLargestNumber(nums));
    }*/



