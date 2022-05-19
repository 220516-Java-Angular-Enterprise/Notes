package com.revature.hal_abs;

public abstract class Circle extends Shape_hw {
    //* Circle Class: Constructor, Circle(double radius) *//
    //* The Circle class constructor will take in a double that represents a radius of a circle.
    // This value should be stored in an instance variable that is private,
    // since we will use mutators and accessors to manipulate and obtain the value of it. *//
    private double radius;

    private Circle(double radius) {
        this.radius = radius;
    }

    //* Accessors and Mutators, getRadius() setRadius(double radius) *//
    private double getRadius(double radius) {
        return radius;
    }

    private double setRadius(double radius) {
        return radius;
    }
}





