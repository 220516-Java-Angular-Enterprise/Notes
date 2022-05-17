package com.revature.encapsulation;

public class UI {
    public static void main(String[] args) {
        Dog mydog = new Dog("Aegon", "Pitbull", 3, 'M', 'L');
        Dog mydog1 = new Dog();

        mydog.setName("Jon");

        System.out.println(mydog.getName());
    }
}