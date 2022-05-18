package com.revature.abstraction;

public class Circle extends Shape{
    private double radius;
    @Override
    protected double calculateArea() {
        double area = 3.14 * (radius * radius);
        return area;
    }
    @Override
    protected double calculateCircumference() {
        double circ = 2 * 3.14 * radius;
        return circ;
    }

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "circle area = " + calculateArea() +
                " " + "circle circumference = "
                + calculateCircumference();
    }


}
