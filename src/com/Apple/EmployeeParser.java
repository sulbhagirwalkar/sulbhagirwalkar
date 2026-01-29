package com.Apple;

import java.util.ArrayList;
import java.util.List;

public class EmployeeParser {
    public static List<Employee> parseCSV(String csv){

        List<Employee> employees = new ArrayList<>();
        String[] lines = csv.split("\n");

        for(String line: lines){
            String [] parts = line.split(",");

            //if(parts.length == 3){
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                Double salary = Double.parseDouble(parts[2].trim());
                employees.add(new Employee(id, name, salary));
            }
       // }
        return employees;
    }

    public static void main(String[] args) {
        String csvData = "101, John Doe, 500000\n102,Jane Smith, 6000000\n";
        List<Employee> employeeList = parseCSV(csvData);
        for(Employee emp: employeeList) {
            System.out.println(emp);
        }
    }
}
