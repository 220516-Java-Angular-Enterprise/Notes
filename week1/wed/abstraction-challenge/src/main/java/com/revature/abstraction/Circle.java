package com.revature.abstraction;

import java.util.PrimitiveIterator;

public class Circle extends Shape{
    private double radius;

    //Circle constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //Accessor
    public double getRadius() {
        return radius;
    }

    //Mutator
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected double calculateCircumference() {
        return calculateArea();
    }
}
