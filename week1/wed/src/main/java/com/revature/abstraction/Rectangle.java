package com.revature.abstraction;

public class Rectangle extends Shape{
    private double height;
    private double width;
    @Override
    protected double calculateArea() {
        return Math.round((height*width)*100.0)/100.0;
    }

    @Override
    protected double calculateCircumference() {
        return Math.round((2*height + 2*width)*100.0)/100.0;
    }
    public Rectangle(double length, double width) {
        this.height = length;
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
    public String toString() {
        return "Rectangle {" +" length= " + height + " width= " + width + " area= " + calculateArea() + " perimeter= " + calculateCircumference() + '}';
    }


}
