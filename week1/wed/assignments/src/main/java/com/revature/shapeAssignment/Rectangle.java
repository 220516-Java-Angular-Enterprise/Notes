package com.revature.shapeAssignment;

public class Rectangle extends Shape {

    //region <attributes>
    private double height;
    private double width;
    //endregion

    public Rectangle(int x, int y, double height, double width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    //region <getter and setter methods>
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    //endregion

    //region <methods>
    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return (2 * height) + (2 * width);
    }
    //endregion

}
