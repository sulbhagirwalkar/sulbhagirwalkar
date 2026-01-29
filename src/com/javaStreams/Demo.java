package com.javaStreams;

import java.util.Scanner;

public class Demo {

        public static String CourseSlugGenerator(String str) {
            // code goes here
            if(str.isEmpty() || str == null){
                return "";
            }
            String input = str.toLowerCase();
            input = str.replaceAll("[^a-z0-9\\s]","-");
            input = str.toLowerCase().trim().replaceAll("\\s+", "-");
            return input;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            String input = "Java Core Course";
            System.out.print(CourseSlugGenerator(s.nextLine()));
        }
}
