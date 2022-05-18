package com.revature.shapes;

public class Rectangle extends Shape{
    private double length;
    private double width;


    // Abstract Methods
    @Override
    double calculateArea() {
        return length*width;
    }

    @Override
    double calculateCircumference() {
        return 0;
    }

    // Getter & Setter

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    // Constructors

    public Rectangle(){
        super();
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
}
