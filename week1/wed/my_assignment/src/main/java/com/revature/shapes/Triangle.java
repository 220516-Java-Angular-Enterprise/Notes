package com.revature.shapes;

public class Triangle extends Shape{
    private double height;
    private double base;

    // Abstract Methods
    @Override
    double calculateArea() {
        return height*base*0.5;
    }

    @Override
    double calculateCircumference() {
        return base*3;
    }

    // Getters & Setters

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Constructors

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


}
