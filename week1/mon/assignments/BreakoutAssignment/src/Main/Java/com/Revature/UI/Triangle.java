package com.Revature.UI;

public class Triangle extends Shape{


    double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }


    //<editor-fold desc="Get/Set">
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //</editor-fold>


    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculateCircumference() {
        return base * 3;
    }
}
