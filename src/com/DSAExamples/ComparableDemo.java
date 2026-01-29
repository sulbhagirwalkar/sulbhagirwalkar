package com.DSAExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car{
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y){
        brand = b;
        model = m;
        year = y;
    }
}

public class ComparableDemo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Car a = (Car) o1;
        Car b = (Car) o2;

        if(a.year < b.year) return -1;
        if(a.year > b.year)return 1;

        return 0;
    }

    public static void main(String[] args) {
        // create list of cars
        ArrayList<Car> myCar = new ArrayList<>();
        myCar.add(new Car("Acura", "MDX", 2024));
        myCar.add(new Car("Toyota", "CAMRY", 2013));
        myCar.add(new Car("Honda","ACCORD", 2021));

       // Comparator myComparator = new SortByYear();
       // Collections.sort(myCar, myComparator);
    }
}
