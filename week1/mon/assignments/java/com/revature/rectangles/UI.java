package com.revature.rectangles;

public class UI {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.565);
        circle.calculateArea();
        circle.calculateCircumference();
        //Rectangles
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5.565);
        rectangle.setWidth(5.565);
        rectangle.calculateArea();
        rectangle.calculateCircumference();
        //equilateral Triangle
        Triangle triangle = new Triangle();
        triangle.setBase(5.565);
        triangle.setHeight(5.565);
        triangle.calculateArea();
        triangle.calculateCircumference();

    }
}
