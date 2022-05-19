package com.revature.rectangles;

import java.text.DecimalFormat;

public class Circle extends Shapes{
    private double radius;

    public double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }

    Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        DecimalFormat df = new DecimalFormat(("#,###.##"));

double area = Math.PI *(getRadius() *getRadius());
System.out.println(String.format("The area of this circle is: " + df.format(area)));

    }

    @Override
    public void calculateCircumference() {
        DecimalFormat dfCirc = new DecimalFormat("#,###.##");
       double circumference = 2 * Math.PI * getRadius();
        System.out.println("The circumference of the cirlce is: " + dfCirc.format(circumference));

    }


}
