package com.revature.singleresponsibility.bad;

public class Employee {
    private int id;
    private String name;

    // bad because the task of the employee expands on managing adresses
    private String adress;
    private String state;
    private String city;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    // bad because responsible for too much things. Employee class does not need to be responsible
    // for all these things these methods should be moved to a user service

    public void saveData(int x){
        // saves into a database
    }

    public void getName(){
        // saves into a database
    }


}
