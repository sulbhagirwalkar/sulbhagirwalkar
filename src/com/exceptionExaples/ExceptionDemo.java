package com.exceptionExaples;

public class ExceptionDemo {
    public static void main(String[] args) {
        String name = null;
        try {
            int length = name.length();
            System.out.println("the length of the string is" + length);
            throw new ArithmeticException();
        } catch (NullPointerException e) {
            System.err.println("can not call a method on null object reference");
        }
    }
}
