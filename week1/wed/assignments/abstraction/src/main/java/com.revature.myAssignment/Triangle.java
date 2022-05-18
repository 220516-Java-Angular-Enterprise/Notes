package com.revature.myAssignment;

public class Triangle extends Shape {
    // Limited to only Equilateral Triangles


    private double height;
    private double base;

    public Triangle() {}
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    protected double calculatedArea() {
        return (base * height) / 2;
    }

    @Override
    protected double calculateCircumference() {
        return base * 3;
    }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }
}
