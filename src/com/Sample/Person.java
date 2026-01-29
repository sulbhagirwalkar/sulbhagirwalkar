package com.Sample;

import java.util.Collections;
import java.util.Comparator;

public class Person{
   // Comparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
   private String name;
   private String department;
   private int salary;

   public Person(String name, String department, int salary) {
      this.name = name;
      this.department = department;
      this.salary = salary;
   }

   @Override
   public String toString() {
      return "Person{" +
              "name='" + name + '\'' +
              ", department='" + department + '\'' +
              ", salary=" + salary +
              '}';
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDepartment() {
      return department;
   }

   public void setDepartment(String department) {
      this.department = department;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }
}
