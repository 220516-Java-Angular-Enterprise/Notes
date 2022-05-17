package com.revature.my_encapsulation;

public class Dog {
    private String breed;
    private int age;
    private char size;

    public Dog(){

    }

    public Dog(String breed, int age, char size){
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    public void bark(){
        System.out.println("Woof!");
    }

    private void shake(){
        System.out.println("Good day to you sir");
    }
}
