package com.javaStreams;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo1 {
    public static void main(String[] args) {
       // record Car(String type, String make, String model, Integer engineCapacity){}

       record Car(String type, String make, String model, Integer engineCapacity){}
        List<Car> cars = List.of(new Car("Sedan", "Toyota", "530", 1998),
                new Car("Sedan", "Audi", "A5", 1998),
                new Car("SUV", "Acura", "MDX", 2000),
                new Car("mid SUV", "Subaru", "Forester", 1945));
       Map<Boolean, List<Car>> partishionedCars = cars.stream().collect(Collectors.partitioningBy(car ->car.type.equals("Sedan")));
        System.out.println(partishionedCars);
       // cars.stream().sorted(Comparator.comparing(car -> car.type).thenComparing(car -> car.make)).collect(Collectors.toSet());
     //   numbers.forn -> System.out.println(n));
    }
}
