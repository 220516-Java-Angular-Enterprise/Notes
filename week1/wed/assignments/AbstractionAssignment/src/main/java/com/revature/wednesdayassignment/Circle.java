package com.revature.wednesdayassignment;

public class Circle extends Shape {

    private double radius;



    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return (this.radius * this.radius) * Math.PI;
    }

    @Override
    protected double calculateCircumference() {
        return 2 * this.radius * Math.PI;
    }
}
