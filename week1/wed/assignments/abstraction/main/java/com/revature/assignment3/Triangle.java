package com.revature.assignment3;

public class Triangle extends Shape {
    private double mBase;
    private double mHeight;

    public Triangle() {
        this(0,0);
    }
    public Triangle(double base, double height) {
        mBase = Math.abs(base);
        mHeight = Math.abs(height);
    }

    public double getBase() { return mBase; }
    public void setBase(double h) { mBase = Math.abs(h); }

    public double getHeight() { return mHeight; }
    public void setHeight(double w) { mHeight = Math.abs(w); }

    @Override
    public double calculateArea() {
        return 0.5 * mHeight * mBase;
    }

    @Override
    public double calculateCircumference() {
        return mBase + 2 * (Math.sqrt(mBase*mBase/4 + mHeight*mHeight));
    }
}
