package com.javaStringExamples;

public class SubStringCons {
    public static void main(String[] args) {
        byte[] ascii = {65, 66, 67, 68, 69, 70};
        String s1 = new String(ascii);
        System.out.println(s1);
        String s2 =  new String(ascii, 1, 3);
        System.out.println(s2);

        char[] chars = {'a', 'b', 'c'};
        String s3 = new String(chars);
        System.out.println(s3.length());


    }
}
