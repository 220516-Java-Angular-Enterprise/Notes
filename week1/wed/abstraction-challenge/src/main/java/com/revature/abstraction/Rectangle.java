package com.revature.abstraction;

public class Rectangle extends Shape{
    private double height;
    private double width;

    //constructor
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    //Height accessor
    public double getHeight() {
        return height;
    }

    //Height Mutator
    public void setHeight(double height) {
        this.height = height;
    }

    //Width accessor
    public double getWidth() {
        return width;
    }

    //Width mutator
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected double calculateArea() {
        return width * height;
    }

    @Override
    protected double calculateCircumference() {
        return (width * 2) + (height * 2);
    }
}
