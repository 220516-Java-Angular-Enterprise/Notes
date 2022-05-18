package com.revature.myAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle t = new Triangle(2.6, 3);

    @Test
    void calculatedArea() {
        assertEquals((t.getBase() * t.getHeight()) / 2, t.calculatedArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(9, t.calculateCircumference());
    }

    @Test
    void getHeight() {
        assertEquals(2.6, t.getHeight());
    }

    @Test
    void setHeight() {
        t.setHeight(6);
        assertEquals(6, t.getHeight());
    }

    @Test
    void getBase() {
        assertEquals(3, t.getBase());
    }

    @Test
    void setBase() {
        t.setBase(9);
        assertEquals(9, t.getBase());
    }
}