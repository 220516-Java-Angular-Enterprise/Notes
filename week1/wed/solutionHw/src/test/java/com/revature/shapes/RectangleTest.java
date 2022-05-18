package com.revature.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle = new Rectangle(0,0,10, 2);

    @Test
    void getLength() {
        assertEquals(10, rectangle.getLength());
    }

    @Test
    void setLength() {
    rectangle.setLength(15);
    assertEquals(15, rectangle.getLength());
    }

    @Test
    void getWidth() {
        assertEquals(2, rectangle.getWidth());
    }

    @Test
    void setWidth() {
        rectangle.setWidth(4);
        assertEquals(4, rectangle.getWidth());
    }

    @Test
    void calculateArea() {
        assertEquals(20, rectangle.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(24, rectangle.calculateCircumference());
    }
}