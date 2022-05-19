package com.revature.inheritance;

public abstract class Shape {

    /* Making a method abstract creates a parent-to-child contract. */
    /* The class that extends this class will HAVE to implement getArea() and getPerimeter(). */
    protected abstract double getArea();

    protected abstract double getPerimeter();
}
