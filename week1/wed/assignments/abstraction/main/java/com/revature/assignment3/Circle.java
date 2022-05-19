package com.revature.assignment3;

public class Circle extends Shape{
    private double mRadius;

    public Circle() {
        this(0);
    }
    public Circle(double radius) {
        mRadius = Math.abs(radius);
    }

    public double getRadius() { return mRadius; }
    public void setRadius(double r) {
        mRadius = Math.abs(r);
    }

    @Override
    public double calculateArea() {
        return Math.PI * mRadius*mRadius;
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * mRadius;
    }
}
