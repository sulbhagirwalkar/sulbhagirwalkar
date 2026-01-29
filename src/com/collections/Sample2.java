package com.collections;

import java.util.Arrays;
import java.util.List;

public class Sample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ALice", "Charan", "Thomas", "Richard","Zoya");
        names.stream().filter(name -> name.startsWith("C")).map(String::toUpperCase).
                forEach(System.out::println);
    }
}
