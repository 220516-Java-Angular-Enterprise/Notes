package com.revature.demo;

public class UI {
    public static void main(String[] args) {
        Dog mydog = new Dog("Aegon", "Pitbull", 3, 'M', 'L');
        Dog mydog1 = new Dog();

        mydog.setName("Jon");
        mydog.getAge();
        System.out.println(mydog.getBreed());
    }
}