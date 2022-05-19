package com.revature.shape;
import java.lang.Math;
public abstract class Circle extends Shape {
    private double radius;

    public Circle(double radius){this.radius=radius;}
    public double getRadius(){return radius;}

    public void setRadius(double radius){this.radius =radius;}
    @Override
    public double calculateArea() {
        return truncate(Math.PI * Math.pow(radius,2));
    }

    @Override
    public double calculateCircumference() {
        return truncate(2.0 * Math.PI*radius);
    }
}
