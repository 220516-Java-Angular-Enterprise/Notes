package com.revature.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest extends Shape {

    Circle circle1 = new Circle(4.00);
    Circle circle2 = new Circle(45.00);
    Circle circle3 = new Circle(5.55);

    @Test
    void testCalculateArea() {
        assertEquals(50.24, circle1.calculateArea());
        assertEquals(6358.5, circle2.calculateArea());
        assertEquals(96.71985, circle3.calculateArea());
    }

    @Test
    void testCalculateCircumference() {
        assertEquals(25.12, circle1.calculateCircumference());
        assertEquals(282.6, circle2.calculateCircumference());
        assertEquals(34.854, circle3.calculateCircumference());
    }

    @Override
    protected double calculateArea() {
        return 0;
    }

    @Override
    protected double calculateCircumference() {
        return 0;
    }
}