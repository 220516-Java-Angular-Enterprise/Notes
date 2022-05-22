package com.revature.wednesdayassignment;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle() {}

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected double calculateArea() {
        return width * height;
    }

    @Override
    protected double calculateCircumference() {
        return (2 * height) + (2 * width);
    }
}
