package com.revature.shapes;

public class Triangle extends Shape {

    double height;
    double base;

    public Triangle(){}

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }


    @Override
    protected double calculateArea() {
        return 0;
    }

    @Override
    protected double calculateCircumference() {
        return 0;
    }
}