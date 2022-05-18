package com.revature.abstraction;

public class Triangle extends Shape {
    private double height;
    private double base;

    // constructor only takes base bc we are assuming equilateral triangle
    public Triangle(double b) {
        this.base = b;
        height = Math.round((base*Math.sqrt(3)/2)*100.0)/100.0;
    }
    @Override
    protected double calculateArea() {
        return Math.round((0.5*base*height)*100.0)/100.0;
    }
    @Override
    protected double calculateCircumference() {
        return Math.round((3*base)*100.0)/100.0;
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

    @Override
    public String toString() {
        return "Triangle {" +" height= " + height + " base= " + base + " area= " + calculateArea() + " perimeter= " + calculateCircumference() + '}';
    }
}
