package com.Java8Programs;

public class ReverseAString {

    public static String reverseString(String strn){
        return new StringBuilder(strn).reverse().toString();
    }
    public static void main(String[] args) {

        System.out.println(reverseString("Sulbha is very smart intellegnet"));
    }
}
