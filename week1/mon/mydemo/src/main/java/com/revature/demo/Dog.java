package com.revature.demo;

public class Dog {

    private String breed;
    private int age;
    private char gender;

    public Dog(String breed, int age, char gender){
        this.breed = breed;
        this.age = age;
        this.gender = gender;
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

    @Override
    public String toString(){
        return "This " + breed + " is a " + gender + " that is "
                + age + " years old.";
    }
}
