package com.revature.abstraction;

public class Circle extends Shape {
    private double radius;
    private double pi = 3.1459;
    public Circle(double r){
        this.radius = r;
    }
    @Override
    protected double calculateArea() {
        double area = (pi*Math.pow(radius,2));
        return Math.round(area*100.0)/100.0;
    }

    @Override
    protected double calculateCircumference() {
        double circum = (2*pi*radius);
        return Math.round(circum*100.0)/100.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }
    @Override
    public String toString() {
        return "Circle {" + " radius= " + getRadius() + " area= " + calculateArea() + " circumference= " + calculateCircumference() + '}';
    }

}