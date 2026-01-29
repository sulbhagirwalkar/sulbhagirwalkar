package com.JavaBasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //List<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3));

        Collection<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3, 5));
        numbers.remove(5);
        System.out.println(numbers);
    }
}
