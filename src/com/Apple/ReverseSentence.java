package com.Apple;

public class ReverseSentence {
    String input = "Hello Sulbha, good moring!";
    public static String returnReverser(String input){
        String[] reverse = input.split("//s");
        StringBuilder reverseString = new StringBuilder();
        for(String word: reverse){
            reverseString.append(new StringBuilder(word).reverse());
        }
        return reverseString.toString().trim();
    }

    public static void main(String[] args) {
        String demo = "Hello Sulbha, good morning!";
        System.out.println(returnReverser(demo

        ));
    }
}
