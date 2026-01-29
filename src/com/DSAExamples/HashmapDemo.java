package com.DSAExamples;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("India", "New Delhi");
        hashmap.put("England", "London");
        hashmap.put("USA", "Washington DC");
        //System.out.println(hashmap);
        System.out.println(hashmap.entrySet());

    }
}
