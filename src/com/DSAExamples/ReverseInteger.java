package com.DSAExamples;

public class ReverseInteger {

    public static int reverseInt(int number){
        int result = 0 ;

        while(number != 0){
            int lastDigit = number % 10;
            result = result * 10 + lastDigit;
            number = number / 10;
        }
        return result;
        // number is 245
        //last digit will be 5 number will bw 24
        //
    }
    public static void main(String[] args) {
    int number = 245;
        System.out.println(reverseInt(number));
    }
}
