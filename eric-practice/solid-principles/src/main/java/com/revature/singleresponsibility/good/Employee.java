package com.revature.singleresponsibility.good;

public class Employee {

    private int id;
    private String name;
    //  You dont have to change anything with employee class to change Address
    Address address;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
