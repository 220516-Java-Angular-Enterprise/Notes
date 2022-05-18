package com.revature.shapes;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {}

    public Rectangle(int x, int y, double length, double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected double calculateArea() {
        return length * width;
    }

    @Override
    protected double calculateCircumference() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

}