package com.revature.abstraction;

public class Triangle extends Shape {

    private double height;
    private double base;
    @Override
    protected double calculateArea() {
        double area = (height * base) / 2;
        return area;
    }

    @Override
    protected double calculateCircumference() {
        double perimeter = base * 3;
        return perimeter;
    }
    public Triangle(){}

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public String toString() {
        return "Triangle area = " + calculateArea() +
                " " + "Triangle perimeter = "
                + calculateCircumference();
    }
}
