package com.DSAExamples;

import java.util.HashMap;

public class HashmapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> studentScore = new HashMap<>();
        studentScore.put("Sulbha", 83);
        studentScore.put("Alice", 91);
        studentScore.put("Bob", 78);
        studentScore.put("Sameera", 98);
         int scoreOfAlice = studentScore.get("Alice");
       // System.out.println(scoreOfAlice);
        studentScore.put("Aman", 75);
       // boolean hasDavid = studentScore.containsKey("Alice");
       int SulbhaScore = studentScore.getOrDefault("Sulbha", 35);
        System.out.println(SulbhaScore);
       /* System.out.println(hasDavid);
        System.out.println("ALl students score");
        for(String name: studentScore.keySet()){
            System.out.println( name + ": "+ studentScore.get(name));
        }

    */}

}
