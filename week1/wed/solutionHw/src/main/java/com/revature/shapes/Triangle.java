package com.revature.shapes;

public class Triangle extends Shape {

    double height;
    double base;

    public Triangle() {
    }

    public Triangle(int x, int y, double height, double base) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.base = base;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }


    @Override
    protected double calculateArea() {

        return 0.5 * base * height;
    }

    @Override
    protected double calculateCircumference() {

        return 3 * base;
    }
}

