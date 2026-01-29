package com.DSAExamples;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static int[] rowCentric(int[][] demo) {
        int row = demo.length;
        int col = demo[0].length;
        int[] flat = new int[row * col];
        // System.out.println(demo.length);
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                flat[index++] = demo[i][j];
        }
        return flat;

    }
    public static void main(String[] args) {
         int[][] demo = {{1, 2, 4}, {3, 5, 7}};

       int[] result = rowCentric(demo);
        System.out.println(Arrays.stream(result).toArray());

    }
    }

