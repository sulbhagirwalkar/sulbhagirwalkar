package com.javaStringExamples;

public class MaskLastFourDigits {
    public static String maskLastFourDigits(String card){
        String digitsOnly = card.replaceAll("[^\\d]","");

        if(card.length() < 4){
            return "invalid card";
        }
        String maskingCharacter = "****-*****-*****-";
        String  lastFour = digitsOnly.substring(digitsOnly.length()-4);
        return maskingCharacter + lastFour;



    }
}
