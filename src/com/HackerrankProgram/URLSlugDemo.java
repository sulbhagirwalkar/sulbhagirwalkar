package com.HackerrankProgram;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLSlugDemo {
    public static String titleToUrl(String title){
        //convert to lowercase
        String lower = title.toLowerCase();

        //Replace spaces and mon-alphanumeric characters with hyphens
        String slug = lower.replaceAll("[^a-z0-9]+","-");

        //remove leading and trailing zeros
        slug = slug.replaceAll("^-+|-+$", "");

        //Encode the String to make it URL-safe
        return URLEncoder.encode(slug, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        String title = "Java Spring Boot Developer Guide";
        String url = titleToUrl(title);
        System.out.println(url);
    }
}
