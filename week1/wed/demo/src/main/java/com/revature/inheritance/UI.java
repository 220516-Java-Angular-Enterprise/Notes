package com.revature.inheritance;

public class UI {
    public static void main(String[] args) {
        Cat myCat = new Cat(5, 's', "persian", "garfield");

        System.out.println(myCat.sound("Overloading"));
    }
}
