package com.revature.abstraction;

public class Rectangle extends Shape{
    double height;
    double width;

    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    protected double calculateArea(){
        return width*height;
    }

    @Override
    protected double calculateCircumference(){
        return (height*2)+(width*2);
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
