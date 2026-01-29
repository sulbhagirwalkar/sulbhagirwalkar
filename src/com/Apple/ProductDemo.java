package com.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductDemo {
    public static void main(String[] args) {
        List<String> productList = Arrays.asList("Laptop", "Tv","Mobile","Laptop","Headphone","Mobile");
        List<String> result = productList.stream()
                                         .distinct()
                                         .map(String::toUpperCase)
                                         .sorted()
                                         .toList();
        System.out.println(result);
        //implement a method that groups a list of transactions by month and calculates the average transaction amount per month.
        List<Integer> expenses =  Arrays.asList(2,5,6,3,5);
               // make use of hashmap
        
    }

}
