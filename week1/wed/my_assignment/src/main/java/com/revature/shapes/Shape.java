package com.revature.shapes;

public abstract class Shape {
    protected int x;
    protected int y;

    abstract double calculateArea();
    abstract double calculateCircumference();

    public Shape(){
        super();
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
