package com.DSAExamples;

import java.util.Optional;

class Customer{
   private int id;
   private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class OptionalDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer(10003, "Sulbha");
        Customer customer2 = new Customer(10004, null);

       Optional<String> customerName =  Optional.ofNullable(customer2.getName());

        System.out.println(customerName);

        }
}
