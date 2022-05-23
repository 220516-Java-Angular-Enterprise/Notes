package com.revature.Inheritance;

public class Rectangle extends Shape {

    /* Rectangle now have access to Shape's methods because it's a child of Shape. */
    @Override
    protected double getArea() {
        /* We still need to implement the functionality of this method for this shape. */
        return 0;
    }

    @Override
    protected double getPerimeter() {
        return 0;
    }
}

