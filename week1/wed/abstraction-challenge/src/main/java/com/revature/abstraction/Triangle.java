package com.revature.abstraction;

public class Triangle extends Shape{
    private double height;
    private double base;

    //constructor
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    //Height accessor
    public double getHeight() {
        return height;
    }

    //Height mutator
    public void setHeight(double height) {
        this.height = height;
    }

    //Base accessor
    public double getBase() {
        return base;
    }

    //Base mutator
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    protected double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    protected double calculateCircumference() {
        return base * 3;
    }
}
