package com.JavaBasics;

enum VehicleType{ CAR, TRUCK, TRAIN, PLANE, MOTORCYCLE }
public class SwitchStatements {
    public static int getMonthNumber(String month){
       int monthNumber = switch (month.toLowerCase()){
            case "january" -> 1;
            case "february" -> 2;
            case "march" -> 3;
            case "april" -> 4;
            case "may" -> 5;
            case "june" -> 6;
            case "july" -> 7;
            case "august" -> 8;
            case "september" -> 9;
            case "october" -> 10;
            case "november" -> 11;
            case "december" -> 12;
           default -> throw new IllegalStateException("Unexpected value: " + month.toLowerCase());
       };
        return monthNumber;
    }
    public static void main(String[] args) {
        //Java 14 - switch expressions
        //feature of switch expressions
        // 1. can be used as expression
        // 2. No need for break statement
        // 3. Arrow syntax (lambda-like syntax)
        // 4. Multiple case per line
        // 5. yield keyword to replace break when returning a value
        VehicleType vehicle1 = VehicleType.MOTORCYCLE;
        switch (vehicle1){
            case CAR -> System.out.println("It's a car");
            case TRUCK -> System.out.println("It's a truck");
            case TRAIN -> System.out.println("It's a train");
            case PLANE -> System.out.println("It's a plane");
            case MOTORCYCLE -> System.out.println("its a motorcycle");
            default -> System.out.println("Invalid input");
        }
    }
}
