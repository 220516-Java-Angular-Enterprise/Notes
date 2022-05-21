package com.revature.openandclosed;

public class Employee {
    private int id;
    private String name;
    // say we wanted to add a
    // String trainingPlace
    // if we add it to the constructor it would break all the programs
    // that call the original constructor

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void printMe(){
        System.out.println("Employee ID " + this.id
                + " Employee name is " + this.name);
    }
}
