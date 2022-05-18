package com.revature.demo;

public class UI {
    public static void main(String[] args){
    Dog mydog = new Dog();
    //mydog.setName("Toby");
    mydog.setBreed("Shiztu");
    mydog.setAge(2);
    mydog.setGender('M');
    mydog.setSize('S');


    mydog.bark();
    System.out.println(mydog);

    }

}
