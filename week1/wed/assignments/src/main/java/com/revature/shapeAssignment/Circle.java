package com.revature.shapeAssignment;
import java.lang.Math;

public class Circle extends Shape{

    //region <attributes>
    private double radius;
    //endregion

    public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //region <methods>
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }
    //endregion


    //region <getter and setter methods>
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //endregion
}
