package com.revature.hal_abs;

public abstract class Triangle extends Shape_hw{
    //* abstract *//
    @Override
    protected double calculateArea(int x, int y) {
        return x*y;
    }

    @Override
    protected double calculateCircumference(double z) {
        return z*3;
    }

    //* constructors *//
    private double height;
    private double base;

    //* getHeight() getWidth() setHeight(double height) setWidth(double width) *//
    private double getWidth(int base){return base;}
    private double getHeight(int height) {return height;}

    private void setBase(double base){}
    private void setHeight(double height){}



}
