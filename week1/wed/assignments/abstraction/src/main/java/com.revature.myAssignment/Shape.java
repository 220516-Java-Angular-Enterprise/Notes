package com.revature.myAssignment;

public abstract class Shape {
    protected int x;

    protected int y;

    public Shape() {}
    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected abstract double calculatedArea();
    protected abstract double calculateCircumference();

}
