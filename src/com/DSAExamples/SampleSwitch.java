package com.DSAExamples;

public class SampleSwitch {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++){
            switch (i){
                case 0:
                    System.out.println("I is zero");
                    break;
                case 1:
                    System.out.println("I is one");
                    break;
                case 2:
                    System.out.println("I is two");
                    break;
                case 3:
                    System.out.println("I is three");
                    break;
                default:
                    System.out.println("i is greater than five");

            }
        }
    }
}
