package com.revature.assignment3;

public class Circle extends Shape {
    private double radius;
public Circle(){}
    public  Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
   public void setRadius(double radius){
        this.radius=radius;
   }


    @Override
    protected double calculateArea() {
        return Math.pow(getRadius(),2)*Math.PI;
    }

    @Override
    protected double calculateCircumference() {
        return (2*getRadius())*Math.PI;
    }
}