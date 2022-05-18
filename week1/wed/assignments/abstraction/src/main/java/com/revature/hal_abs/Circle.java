package com.revature.hal_abs;

public class Circle extends Shape_hw {
    //* Circle Class: Constructor, Circle(double radius) *//
    //* The Circle class constructor will take in a double that represents a radius of a circle.
    // This value should be stored in an instance variable that is private,
    // since we will use mutators and accessors to manipulate and obtain the value of it. *//

    private double radius;

    //* abstract methods *//
    @Override
    protected double calculateArea() {
        return Math.PI *(2*radius);
    }

    @Override
    protected double calculateCircumference() {
        return 2*Math.PI*radius;
    }

    //* Accessors and Mutators, getRadius() setRadius(double radius) *//
    private double getRadius(){return radius;}

    private void setRadius(double radius){}

}



