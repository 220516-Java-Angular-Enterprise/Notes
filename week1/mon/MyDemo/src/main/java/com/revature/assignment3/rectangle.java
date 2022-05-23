package com.revature.assignment3;


public class rectangle extends Shape {

private double height;
private double width;

public rectangle(){}
    public rectangle(double height, double width){

    this.height=height;
    this.height=width;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    @Override
    protected double calculateArea() {
        return (getWidth()*getHeight());
    }

    @Override
    protected double calculateCircumference() {
        return 2*(getWidth()+getHeight());
    }
}