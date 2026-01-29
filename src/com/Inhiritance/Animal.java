package com.Inhiritance;

public class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name + "is eating");
    }
}
class Dog extends Animal{
    String breed;
    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    public void bark(){
        System.out.println(name + " the " + breed + " barks!");
    }
    @Override
    public void eat(){
        System.out.println(name + " is eating");
    }
}
