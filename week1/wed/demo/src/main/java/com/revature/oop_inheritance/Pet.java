package com.revature.oop_inheritance;

public abstract class Pet {
    protected int age;
    protected char size;
    protected String breed;
    protected String name;

    protected Pet() {}

    protected Pet(int age, char size, String breed, String name) {
        this.age = age; this.size = size; this.breed = breed; this.name = name;
    }
}
