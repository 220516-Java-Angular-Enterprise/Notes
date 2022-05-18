package com.Revature.UI;

public class Circle extends Shape{



    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    //<editor-fold desc="Get/Set">
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else{
            System.out.println("Invalid Radius! Must be greater than 0.");
        }
    }
    //</editor-fold>

    @Override
    public double calculateArea() {
        //pi * radius^2
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculateCircumference() {
        //2pi * radius
        return (2 * Math.PI) * radius;
    }
}
