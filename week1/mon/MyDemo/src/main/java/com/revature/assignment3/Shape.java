package com.revature.assignment3;

public abstract class Shape {
    //center of the coordinates of the shape
    protected int x;
    protected int y;

    /* Making a method abstract creates a parent-to-child contract. */
    /* The class that extends this class will HAVE to implement getArea() and getPerimeter(). */
    //protected abstract double getArea();

    //protected abstract double getPerimeter();

    public Shape() {

    }

    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;

}
protected abstract double calculateArea();
protected abstract double calculateCircumference();
}