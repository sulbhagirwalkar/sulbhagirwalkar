package com.Apple;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        }catch (Throwable e){
            System.out.println("Can not divide by zero");
           // e.printStackTrace();
        }
    }
}
