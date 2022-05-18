package com.revature.myAssignment;

public class Circle extends Shape{

    private double radius;

    //Constructors:
    public Circle () {}
    public Circle (double radius) {
        this.radius = radius;
    }

    // Getters and Setters
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    protected double calculatedArea() {
        // Area of a circle = pi * r ^ 2
        return (this.radius * this.radius) * Math.PI;
    }

    @Override
    protected double calculateCircumference() {
        return 2 * this.radius * Math.PI;
    }
}
