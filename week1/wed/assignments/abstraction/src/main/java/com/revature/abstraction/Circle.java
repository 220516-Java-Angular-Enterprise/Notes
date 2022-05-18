package com.revature.abstraction;

public class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*(Math.pow(radius, 2));
    }

    @Override
    protected double calculateCircumference(){
        return Math.PI*(radius*2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
