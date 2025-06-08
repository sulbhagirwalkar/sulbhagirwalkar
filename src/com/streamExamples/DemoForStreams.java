package com.streamExamples;

import java.util.ArrayList;
import java.util.List;

class Person{
    private int id;
    private String name;
    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class Citizen extends Person {
    public Citizen(int id, String name, String age) {
        super(id, name, age);
    }
}
public class DemoForStreams {
    public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();


    personList.stream()
              .filter(person -> person.getName().contains("A"))
              .map(person -> person.getAge())
            .toList();

              }
}
