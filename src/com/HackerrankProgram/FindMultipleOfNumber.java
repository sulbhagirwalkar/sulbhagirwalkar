package com.HackerrankProgram;

import java.util.Arrays;

public class FindMultipleOfNumber {
    private static String name;

    public static void main(String[] args) {
        int input = 4;
            for (int i = 0; i <= 10; i++) {
                System.out.println("4 X " + i + " = " + input * i);
            }
       /* String input = "abba";
        String result = new StringBuilder(input).reverse().toString();
        if(input.equals(result)){
            System.out.println("is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
*/

        String name = "abaa";
        String result = new StringBuilder(name).reverse().toString();
        if(result.matches(name)){
            System.out.println("is Palindrome");
        }else{
            System.out.println("not a palindrome");
        }

        }
    }

