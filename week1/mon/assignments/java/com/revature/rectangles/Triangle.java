package com.revature.rectangles;

import java.text.DecimalFormat;

public class Triangle extends Shapes{
    private double height;
    private double base;

    public double getHeight(){
       return height;
   }

    public double getBase(){
       return base;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setBase(double base){
        this.base = base;
    }

    Triangle(){}
    Triangle(double base, double height){
       this.base = base;
       this.height = height;

    }

    @Override
    public void calculateArea() {
        DecimalFormat df = new DecimalFormat(("#,###.##"));
        double area = ((Math.sqrt(3)/4)*(getBase() * getHeight()));
        System.out.println("The area of this equilateral Triangle is: " + df.format(area));

    }

    @Override
    public void calculateCircumference() {
        DecimalFormat dfCirc = new DecimalFormat("#,###.##");
    double perimeter = (getBase() * 3)/2;
    System.out.println("The perimeter of the equilateral triangle is: " + dfCirc.format(perimeter));
    }
}
