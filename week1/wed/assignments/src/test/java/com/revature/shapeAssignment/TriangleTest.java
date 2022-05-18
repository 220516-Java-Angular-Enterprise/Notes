package com.revature.shapeAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle(0, 0, 3, 3);

    @Test
    void getHeight() {
        assertEquals(3, triangle.getHeight());
    }

    @Test
    void setHeight() {
        triangle.setHeight(5);
        assertEquals(5, triangle.getHeight());
    }

    @Test
    void getBase() {
        assertEquals(3, triangle.getBase());
    }

    @Test
    void setBase() {
        triangle.setBase(7);
        assertEquals(7, triangle.getBase());
    }

    @Test
    void calculateArea() {
        assertEquals(4.5, triangle.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(9, triangle.calculateCircumference());
    }
}