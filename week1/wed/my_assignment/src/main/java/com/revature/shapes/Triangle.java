package com.revature.shapes;

public class Triangle extends Shape{
    private double height;
    private double base;

    // Abstract Methods
    @Override
    double calculateArea() {
        return round(height*base*0.5,2);
    }

    @Override
    double calculateCircumference() {
        return round(base*3,2);
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
