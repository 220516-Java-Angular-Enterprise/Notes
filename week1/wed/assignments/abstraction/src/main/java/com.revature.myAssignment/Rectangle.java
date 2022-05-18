package com.revature.myAssignment;

public class Rectangle extends Shape{

    private double height;
    private double width;

    // Constructors
    public Rectangle() {}
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    protected double calculatedArea() {
        return height * width;
    }

    @Override
    protected double calculateCircumference() {
        return 2 * height + 2 * width;
    }

    //Getters and Setters
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
}
