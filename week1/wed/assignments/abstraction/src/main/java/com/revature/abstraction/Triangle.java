package com.revature.abstraction;

public class Triangle extends Shape{
    private double height;
    private double base;

    Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    protected double calculateArea(){
        return .5*(base*height);
    }

    @Override
    protected  double calculateCircumference(){
        return base*3;
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
}
