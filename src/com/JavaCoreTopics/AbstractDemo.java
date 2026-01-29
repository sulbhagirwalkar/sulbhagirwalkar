package com.JavaCoreTopics;

abstract class AbstractDemo {
    String color;
    public AbstractDemo(String color){
        this.color = color;
    }

    //Abstract Method
    abstract double getArea();

    //concrete method
    public void displayColor(){
        System.out.println("Color:"+ color);
    }
}
    class Circle extends AbstractDemo{
    double radius;
    public Circle(String color, double radius){
    super(color);
    this.radius = radius;
}
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

}
