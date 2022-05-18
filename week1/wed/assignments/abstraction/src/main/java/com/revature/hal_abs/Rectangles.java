package com.revature.hal_abs;

public class Rectangles extends Shape_hw {
    private double height;
    private double width;

    @Override
    protected double calculateArea() {
        return height*width;
    }

    @Override
    protected double calculateCircumference() {
        return 2*(height+width);
    }
    //* constructors *//


    //* getHeight() getWidth() setHeight(double height) setWidth(double width) *//
    private double getWidth(){return width;}
    private double getHeight() {return height;}

    private void setHeight(double height){}
    private void setWidth(double width){}
}
