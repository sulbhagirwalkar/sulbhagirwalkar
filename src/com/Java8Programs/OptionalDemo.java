package com.Java8Programs;

import java.util.Optional;

public class OptionalDemo {
    public static Optional<String> findUserName(long userId){
        if(userId == 123){
            return Optional.of("Alice");
        }else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        Optional<String> user1 = findUserName(123);
        Optional<String> user2 = findUserName(456);

        //using ifPresent
       // user1.isPresent(name -> System.out.println("user 1 found: "+));
        String capatalizedUserName = findUserName(123)
                .map(String::toUpperCase).orElse("Unknown");
        String na = findUserName(234)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

    }
}
