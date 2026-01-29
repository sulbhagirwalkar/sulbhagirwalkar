package com.DSAExamples;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int result = 10/0;
            System.out.println("Result : "+ result);
            }catch (ArithmeticException e){
            System.out.println("error: cannot divide by zero.");
        }
    }
}


