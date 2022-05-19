package com.revature.assignment3;

public class Rectangle extends Shape {
    private double mHeight;
    private double mWidth;

    public Rectangle() {
        this(0,0);
    }
    public Rectangle(double height, double width) {
        mHeight = Math.abs(height);
        mWidth = Math.abs(width);
    }

    public double getHeight() { return mHeight; }
    public void setHeight(double h) { mHeight = Math.abs(h); }

    public double getWidth() { return mWidth; }
    public void setWidth(double w) { mWidth = Math.abs(w); }

    @Override
    public double calculateArea() {
        return mWidth * mHeight;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (mWidth + mHeight);
    }
}
