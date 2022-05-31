package com.revature.streams_demo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = addEmployee();

        /* Imperative approach to getting employees who are male. */
        System.out.println("-----Imperative approach-----\n");
        for (Employee e : employees) {
            if (e.getGender().equals(Gender.MALE)) System.out.println(e);
        }

        /* Declarative approach. */
        System.out.println("\n-----Declarative approach-----");

        /* FILTER */
        /* Allows us to filter out all employees who are male. */
        System.out.println("\nFILTER:");

        /* SORT */
        /* Allows us to sort Employee based on selected attribute. */
        System.out.println("\nSORT:");

        /* MAP */
        /* Allows us to return the result after modifying it with map. */
        System.out.println("\nMAP:");
    }

    private static List<Employee> addEmployee() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(UUID.randomUUID().toString(), "Bao", "Duong", 26, Gender.MALE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Billy", "Tarantino", 18, Gender.MALE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Emily", "swan", 56, Gender.FEMALE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Sue", "Harris", 86, Gender.FEMALE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Tracy", "Adams", 21, Gender.OTHER));

        return employees;
    }
}
