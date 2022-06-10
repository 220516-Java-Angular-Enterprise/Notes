package com.revature.shapes;
import java.lang.Math;
public class Circle extends Shape{
    private double radius;

    //getters and setters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Circle constructors only need radius.  the distinguishing feature of a circle, programming-wise, is a radius
    public Circle (double r){
        this.radius = r;
    }
    //implementing methods required by Shape inheritance.
    @Override
    public double calculateArea() {
        return Math.pow(this.radius, 2)*Math.PI;
    }

    @Override
    public double calculateCircumference() {
        return 2*this.radius*Math.PI;
    }



}
