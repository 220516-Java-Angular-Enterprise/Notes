package com.revature.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest extends Shape {

    Rectangle rec1 = new Rectangle(5.55, 6.00);
    Rectangle rec2 = new Rectangle(5.00, 200.59);
    Rectangle rec3 = new Rectangle(0.99, 75.43);

    @Test
    void testCalculateArea() {
        assertEquals(33.3, rec1.calculateArea());
        assertEquals(1002.95, rec2.calculateArea());
        assertEquals(74.6757, rec3.calculateArea());
    }

    @Test
    void testCalculateCircumference() {
        assertEquals(23.1, rec1.calculateCircumference());
        assertEquals(411.18, rec2.calculateCircumference());
        assertEquals(152.84, rec3.calculateCircumference());
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