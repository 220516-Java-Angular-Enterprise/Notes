package com.revature.assignment3;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
Circle circle1 = new Circle(5);
Circle circle2= new Circle(10);
Circle circle3= new Circle(2.14);
Circle circle4= new Circle(0);

    @Test
    void getRadius() {
        assertEquals(5, circle1.getRadius());
        assertEquals(10, circle2.getRadius());
        assertEquals(2.14, circle3.getRadius());
        assertEquals(0, circle4.getRadius());
    }

    @Test
    void setRadius() {
       circle1.setRadius(9);
       circle2.setRadius(2.23);
        circle3.setRadius(1000);
        circle4.setRadius(0);
        assertEquals(9, circle1.getRadius());
        assertEquals(2.23, circle2.getRadius());
        assertEquals(1000, circle3.getRadius());
        assertEquals(0, circle4.getRadius());
    }

    @Test

    void calculateArea() {
        circle1.setRadius(9);
        circle2.setRadius(2.23);
        circle3.setRadius(1000);
        circle4.setRadius(0);
        DecimalFormat df = new DecimalFormat("#.##");
        assertEquals(Math.PI*Math.pow(9,2), circle1.calculateArea());
        assertEquals(df.format(Math.PI*Math.pow(2.23,2)), df.format(circle2.calculateArea()));
        assertEquals(Math.PI*Math.pow(1000,2),circle3.calculateArea());
        assertEquals(Math.PI*Math.pow(0,2), circle4.calculateArea());
    }



    @Test
    void calculateCircumference() {
        circle1.setRadius(9);
        circle2.setRadius(2.23);
        circle3.setRadius(1000);
        circle4.setRadius(0);
        DecimalFormat df = new DecimalFormat("#.##");
        assertEquals(2*Math.PI*circle1.getRadius(), circle1.calculateCircumference());
        assertEquals(df.format(2*Math.PI*circle2.getRadius()), df.format(circle2.calculateCircumference()));
        assertEquals(2*Math.PI*circle3.getRadius(),circle3.calculateCircumference());
        assertEquals(2*Math.PI*circle4.getRadius(), circle4.calculateCircumference());
    }
}