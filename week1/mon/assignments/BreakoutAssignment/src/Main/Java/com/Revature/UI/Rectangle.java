package com.Revature.UI;

public class Rectangle extends Shape{



    private double width, height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    //<editor-fold desc="Get/Set">
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
    }
    //</editor-fold>

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return ( height * 2 ) + ( width * 2 );
    }
}
