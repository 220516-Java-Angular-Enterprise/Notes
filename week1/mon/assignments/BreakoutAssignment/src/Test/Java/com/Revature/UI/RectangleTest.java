package com.Revature.UI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle r = new Rectangle(5, 10);

    @Test
    void getHeight() {
        assertEquals(10, r.getHeight());
    }

    @Test
    void setHeight() {
    }

    @Test
    void getWidth() {
        assertEquals(5, r.getWidth());
    }

    @Test
    void setWidth() {
    }

    @Test
    void calculateArea() {
        assertEquals(50, r.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(30, r.calculateCircumference());
    }
}