package com.DSAExamples;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int firstTerm = 0;
        int nextTerm = 1;
        int fibonacciNum;
       // System.out.println(firstTerm)System.out.println(nextTerm);
        for(int i = 1; i < n; i++){
            fibonacciNum = firstTerm + nextTerm;
            System.out.print(firstTerm  + " ");
            firstTerm = nextTerm;
            nextTerm = fibonacciNum;
            }

        }

    }

