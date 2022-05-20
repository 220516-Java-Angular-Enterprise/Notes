package com.revature.abstraction;

public class Rectangle extends Shape{

    private double height;
    private double width;
    @Override
    protected double calculateArea() {
        double area = height * width;
        return area;
    }

    @Override
    protected double calculateCircumference() {
        double perimeter = (2 * height) + (2 * width);
        return perimeter;
    }

    public Rectangle(){}

    public Rectangle(double height, double width){
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
    public String toString() {
        return "Rectangle area = " + calculateArea() +
                " " + "Rectangle perimeter = "
                + calculateCircumference();
    }
}
