package com.Revature.UI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle t = new Triangle(5, 5);

    @Test
    void getBase() {
        assertEquals(5, t.getBase());
    }

    @Test
    void setBase() {
    }

    @Test
    void getHeight() {
        assertEquals(5, t.getHeight());
    }

    @Test
    void setHeight() {
    }

    @Test
    void calculateArea() {
        assertEquals(12.5, t.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(15, t.calculateCircumference());
    }
}