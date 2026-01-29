package com.collections;

import java.util.ArrayList;

public class Sample1 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        people.add("Sulbha");
        people.add("Dave");
        people.add("Jane");
        people.remove("Dave");
        System.out.println(people);
        if(people.contains("Sulbha")){
            System.out.println("Sulbha is there in the list");
        }
        people.remove(1);
        System.out.println(people);
        people.clear();
        System.out.println(people);

    }
}
