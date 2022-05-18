package com.revature.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle(0, 0, 2,5);

    @Test
    void getHeight() {
        assertEquals(2, triangle.getHeight());
    }

    @Test
    void setHeight() {
        triangle.setHeight(4);
        assertEquals(4, triangle.getHeight());
    }

    @Test
    void getBase() {
        assertEquals(5, triangle.getBase());
    }

    @Test
    void setBase() {
        triangle.setBase(10);
        assertEquals(10, triangle.getBase());
    }

    @Test
    void calculateArea() {
        assertEquals(5, triangle.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(15, triangle.calculateCircumference());
    }
}