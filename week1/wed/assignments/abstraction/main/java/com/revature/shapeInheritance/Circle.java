package com.revature.shapeInheritance;

public class Circle extends Shape{
    private double mRadius;

    public Circle(double radius) {
        mRadius = radius;
    }

    public double getRadius() { return mRadius; }
    public void setRadius(double radius) { mRadius = radius; }

    @Override
    public double calculateArea() {
        return Math.PI * mRadius*mRadius;
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * mRadius;
    }
}
