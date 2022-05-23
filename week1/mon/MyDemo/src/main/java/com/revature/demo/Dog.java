package com.revature.demo;

public class Dog {
    /* attributes of class Dog */
    private String name;
    private String breed;
    private int age;
    private char gender;
    private char size;

    public Dog() {

    }//It means that there's nothing to execute in this Constructor. Usually Java provides this by default. (default constructor.)

    public Dog(String name, String breed, int age, char gender, char size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size=" + size +
                '}';
    }
}
