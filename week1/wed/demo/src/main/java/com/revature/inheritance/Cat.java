package com.revature.inheritance;

public class Cat extends Pet {

    public Cat() {
        super(); // implicitly doing calling super();
    }

    /* The super keyword in Java is a reference variable which is used to refer immediate parent class object. */
    /* Super can be used to refer immediate parent class instance variable. */
    public Cat(int age, char size, String breed, String name) {
        super(age, size, breed, name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", size=" + size +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
