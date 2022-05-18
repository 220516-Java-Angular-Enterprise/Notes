package com.revature.shapes;

public class Circle extends Shape {

//    creates variables to use
    private double radius;

//    creates a blueprint for the circle class
    public Circle() {}

//    creates an actual new Circle object
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

//    Getters and Setters so that we can retrieve and store data values
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {

        double area = Math.PI * Math.pow(radius, 2);
        double roundedA = Math.round(area*100.00)/100.00;
        return roundedA;
    }

    @Override
    protected double calculateCircumference() {

        double circum = 2 * Math.PI * radius;
        double roundedC = Math.round(circum*100.00)/100.00;
        return roundedC;
    }

}