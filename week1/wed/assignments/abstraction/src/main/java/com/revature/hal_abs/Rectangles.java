package com.revature.hal_abs;

public abstract class Rectangles extends Shape_hw {
    private double height;
    private double width;
    //* constructors *//
    public Rectangles(double height, double width) {
        this.height = height;
        this.width = width;
    }


    //* getHeight() getWidth() setHeight(double height) setWidth(double width) *//
    private double getWidth(double width){return width;}
    private double getHeight(double height) {return height;}

    private double setHeight(double height){return height;}
    private double setWidth(double width){return width;}


}
