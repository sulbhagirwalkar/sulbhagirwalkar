package com.Inhiritance;

public class InheritanceExample {
    public static void main(String[] args) {
        // create  an instance of parent class
         Animal a = new Animal("Generic Animal ");
         a.eat();

         //create an instance of Dog class
        Dog myDog = new Dog("Buddy","Golden Retriever");
          myDog.eat();
          myDog.bark();

    }
}
