package com.javaInheritanceExaples;

// simple example of Inheritance

//create a superclass

class A{
        int i, j;

        void show(){
            System.out.println("i and j: " + i + " " + j);
        }

    }
//create a subclass by extending class A

class B extends A {
    int k;

    void showK(){
        System.out.println("K: " + k);
    }
    void sum(){
        int x = i + j + k;
        System.out.println("Sum is:"+ x);

    }
}
public class InheritanceDemo1 {
    public static void main(String[] args) {
        A superObject = new A();
        B subObj = new B();

        //superclass may be used by itself

        superObject.i = 10;
        superObject.j = 20;
        System.out.println("content of super object: "+ superObject.i+ superObject.j);
        superObject.show();
        System.out.println();

        //subclass has access to all public members of  superclass

        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;
        System.out.println("i, j, k are as follows:");
        subObj.show();
        subObj.showK();
        System.out.println("Sum of i+j+k is: ");
        subObj.sum();
        System.out.println();

    }
}