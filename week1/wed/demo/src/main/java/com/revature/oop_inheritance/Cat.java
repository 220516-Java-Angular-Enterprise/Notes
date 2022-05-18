package com.revature.oop_inheritance;

public class Cat extends Pet{
    private int life = 9;

    public Cat() {
        // super(); this is done implicitly
    }

    public Cat(int age, char size, String breed, String name) {
        super(age, size, breed, name);
    }

    @Override
    public String toString() {
        return super.toString()+" "+name;
    }
}
