package com.javaInheritanceExaples;

import java.util.HashMap;
import java.util.Map;

public class HashMapInterviewQuestion {
    public static void main(String[] args) {
        //create a hashmap with key and value
        HashMap<String, String> map = new HashMap<>();
        map.put("XYZ", "Test1");
        map.put("xyz", "Test2");
        map.put("ABC", "Test3");
        map.put("Sulbha", "Test4");
        System.out.println(map.size());
        System.out.println(map.get("XYZ"));
        System.out.println(map.get("xyz"));

        for(String str: map.keySet()){
            System.out.println("hashmap key set foreach"+"key"+ str + map.get(str));

        }
    }

}
