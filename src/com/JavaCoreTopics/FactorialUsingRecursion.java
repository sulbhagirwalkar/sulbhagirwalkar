package com.JavaCoreTopics;

// this is recursive method
class Factorial{
    int fact(int n){
        int result ;
        if(n == 1) return 1;
        result = fact(n-1) * n;
        return result;
    }

}
public class FactorialUsingRecursion {
    public static void main(String[] args) {
    Factorial f = new Factorial();
        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 4 is " + f.fact(4));
    }
}
