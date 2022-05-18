package com.revature.hal_abs;

public class Triangle extends Shape_hw{
    //* abstract *//

    @Override
    protected double calculateArea() {
        return base*height;
    }

    @Override
    protected double calculateCircumference() {
        return base*3;
    }
    //* constructors *//
    private double height;
    private double base;

    //* getHeight() getWidth() setHeight(double height) setWidth(double width) *//
    private double getWidth(){return base;}
    private double getHeight() {return height;}

    private void setBase(double base){}
    private void setHeight(double height){}


}
