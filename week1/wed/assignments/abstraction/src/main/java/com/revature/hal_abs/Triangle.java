package com.revature.hal_abs;

public abstract class Triangle extends Shape_hw{
    //* abstract *//
    private double height;
    private double base;

    //* getHeight() getWidth() setHeight(double height) setWidth(double width) *//
    private double getWidth(int base){return base;}
    private double getHeight(int height) {return height;}

    private void setBase(double base){}
    private void setHeight(double height){}


    @Override
    protected double calculateArea() {
        return 0;
    }

    @Override
    protected double calculateCircumference() {
        return 0;
    }
}
