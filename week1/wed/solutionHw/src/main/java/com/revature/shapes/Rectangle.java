package com.revature.shapes;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    protected double calculateArea() {
        return length * width;
    }

    @Override
    protected double calculateCircumference() {
        return 0;
    }
}