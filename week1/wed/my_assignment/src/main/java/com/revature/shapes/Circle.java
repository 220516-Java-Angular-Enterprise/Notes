package com.revature.shapes;

public class Circle extends Shape{
    private double radius;

    // Abstracts Methods
    @Override
    double calculateArea() {
        return 3.14*Math.pow(radius, 2);
    }

    @Override
    double calculateCircumference() {
        return 3.14*2*radius;
    }

    // Getters & Setters

    public double getRadius(){
        return radius;
    }

    public double setRadius(double radius){
        return this.radius = radius;
    }

    // Constructors

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }
}
