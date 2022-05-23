package com.revature.shapeAssignment;

public class Triangle extends Shape{

    //region <attributes>
    private double height;
    private double base;
    //endregion

    public Triangle(int x, int y, double height, double base){
        this.x = x;
        this.y = y;
        this.height = height;
        this.base = base;
    }

    //region <getter and setter methods>
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    //endregion

    //region <methods>
    @Override
    public double calculateArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public double calculateCircumference() {
        return 3 * base;
    }
    //endregion
}
