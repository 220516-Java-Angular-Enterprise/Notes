package com.revature.exception;

public class Dog {
    private String breed;
    private int age;
    private char size;

    public Dog() {}

    public Dog(String breed, int age, char size) {
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void shake() {
        System.out.println("Shake!");
    }
}
