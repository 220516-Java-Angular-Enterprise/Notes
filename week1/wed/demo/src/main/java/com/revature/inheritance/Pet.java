package com.revature.inheritance;


/* Data abstraction is the process of hiding certain details and showing only essential information to the user. */

/* Abstract classes cannot be directly instantiated. */
/* They can contain concrete and abstract methods. */
/* They DO have constructors. */
public abstract class Pet {

    /* protected members are only accessible to subclasses and other classes within the same package. */
    protected int age;
    protected char size;
    protected String breed;
    protected String name;

    public Pet() {

    }

    protected Pet(int age, char size, String breed, String name) {
        this.age = age;
        this.size = size;
        this.breed = breed;
        this.name = name;
    }
}
