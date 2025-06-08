package com.LeetcodeSoloutions;

import java.util.HashMap;
import java.util.Map;

public class ComputeDemo {
    public static void main(String[] args) {
        String[] students = {"Rahul", "Manisha", "Akash", "Rahul"};
        Map<String, Integer> studentCount = new HashMap<>();

        for(String name: students){
            studentCount.compute(name, (key, value) ->
                    (value == null) ? 1 : value + 1);
        }
        System.out.println(studentCount);

    }
}
