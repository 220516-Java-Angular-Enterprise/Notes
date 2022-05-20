package com.revature.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest extends Shape {
    Triangle tri1 = new Triangle(5.00,10.00);
    Triangle tri2 = new Triangle(27.34,10000);
    Triangle tri3 = new Triangle(0.75,999973.40);

    @Test
    void testCalculateArea() {
        assertEquals(25, tri1.calculateArea());
        assertEquals(136700, tri2.calculateArea());
        assertEquals(374990.025, tri3.calculateArea());
    }

    @Test
    void testCalculateCircumference() {
        assertEquals(30, tri1.calculateCircumference());
        assertEquals(30000, tri2.calculateCircumference());
        assertEquals(2999920.2, tri3.calculateCircumference());
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