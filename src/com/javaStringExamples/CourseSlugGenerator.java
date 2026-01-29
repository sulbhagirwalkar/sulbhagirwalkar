package com.javaStringExamples;

public class CourseSlugGenerator {
    public static String generateSlug(String str){
        if(str.isEmpty() || str == null){
            return "";
        }
        String input = str.toLowerCase();
        input = str.replaceAll("[^a-z0-9\\s]+","-");
        input = str.toLowerCase().trim().replaceAll("\\s+","-");
        return input;
    }

    public static void main(String[] args) {
        String st =" Java & Spring Boot: Fill-stack Developement";
        System.out.println(generateSlug(st));
    }
}
