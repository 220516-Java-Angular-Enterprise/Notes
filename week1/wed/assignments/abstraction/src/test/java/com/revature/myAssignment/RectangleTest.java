package com.revature.myAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r = new Rectangle(10, 20);

    @Test
    void calculatedArea() {
        assertEquals(200, r.calculatedArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(60, r.calculateCircumference());
    }

    @Test
    void getHeight() {
        assertEquals(10, r.getHeight());
    }

    @Test
    void setHeight() {
        r.setHeight(30);
        assertEquals(30, r.getHeight());
    }

    @Test
    void getWidth() {
        assertEquals(20, r.getWidth());
    }

    @Test
    void setWidth() {
        r.setWidth(40);
        assertEquals(40, r.getWidth());
    }
}