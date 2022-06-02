package com.revature.streams;

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
        //List<Employee> maleEmployees = employees.stream().filter(e -> e.getAge() < 30).collect(Collectors.toList());
        List<Employee> maleEmployees = employees.stream().filter(e -> e.getGender().equals(Gender.MALE)).collect(Collectors.toList());
        maleEmployees.forEach(System.out::println);

        /* SORT */
        /* Allows us to sort Employee based on selected attribute. */
        System.out.println("\nSORT:");
        //List<Employee> sortByAge = employees.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
        List<Employee> sortByAge = employees.stream().sorted(Comparator.comparing(Employee::getFirstname)).collect(Collectors.toList());
        sortByAge.forEach(System.out::println);

        /* MAP */
        /* Allows us to return the result after modifying it with map. */
        System.out.println("\nMAP:");
        List<String> fullNames = employees.stream().map(e -> e.getFirstname()+" "+e.getLastname()).collect(Collectors.toList());
        fullNames.forEach(System.out::println);
        List<Integer> names = employees.stream().map(e -> e.getAge() + 10).collect(Collectors.toList());
        names.forEach(System.out::println);
    }

    private static List<Employee> addEmployee() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(UUID.randomUUID().toString(), "Bao", "Duong", 26, Gender.MALE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Billy", "Tarantino", 18, Gender.MALE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Emily", "Swan", 56, Gender.FEMALE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Sue", "Harris", 86, Gender.FEMALE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Tracy", "Adams", 21, Gender.OTHER));

        return employees;
    }
}
