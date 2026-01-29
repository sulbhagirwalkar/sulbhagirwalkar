package com.DSAExamples;
class Abc{
private Abc(){

}
public static Abc obj =new Abc();
public static Abc getInstance(){
    return obj;
}
}
public class SingletonDemo {
    public static void main(String[] args) {
      Abc obj = Abc.getInstance();
      //Abc obj2 = new Abc();
    }
}
