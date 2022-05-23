package com.revature.assignment3;

public class Triangle extends Shape {

private double base;
private double height;
    public Triangle(){}
    public Triangle(double height, double base){

        this.height=height;
        this.base=base;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base){
        this.base=base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    @Override
    protected double calculateArea() {
        return (height*base)/2;
    }

    @Override
    protected double calculateCircumference() {
        return 3*base;
    }

    /* Rectangle now have access to Shape's methods because it's a child of Shape. */

}