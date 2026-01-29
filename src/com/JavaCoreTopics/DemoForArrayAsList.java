package com.JavaCoreTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoForArrayAsList {
    public static void main(String[] args) {
        List<String> fixedList = Arrays.asList("Apple", "Banana", "Orange");
        //fixedList.add("Cherry");
        System.out.println(fixedList);
        List<String> mutableList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));
        mutableList.add("Cherry");
        System.out.println(mutableList);

    }
}
