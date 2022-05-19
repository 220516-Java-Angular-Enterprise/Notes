package com.revature.rectangles;

import java.text.DecimalFormat;

public class Rectangle extends Shapes{
    double height;
    double width;
    private double getHeight(){
        return height;
    }
    private double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }

    Rectangle(){}
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        DecimalFormat df = new DecimalFormat(("#,###.##"));
        double area = (getWidth() * getHeight());
        System.out.println("The area of this rectangle is: " + df.format(area));

    }

    @Override
    public void calculateCircumference() {
        DecimalFormat dfCirc = new DecimalFormat("#,###.##");
       double perimeter = 2*(getHeight() + getWidth());
        System.out.println("The perimeter of this rectangle is: " + dfCirc.format(perimeter));

    }
}
