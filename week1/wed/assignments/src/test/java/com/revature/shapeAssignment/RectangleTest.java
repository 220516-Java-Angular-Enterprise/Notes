package com.revature.shapeAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle = new Rectangle(0, 0, 4, 6);
    @Test
    void getHeight() {
        assertEquals(4, rectangle.getHeight());
    }

    @Test
    void setHeight() {
        rectangle.setHeight(5);
        assertEquals(5, rectangle.getHeight());
    }

    @Test
    void getWidth() {
        assertEquals(6, rectangle.getWidth());
    }

    @Test
    void setWidth() {
        rectangle.setWidth(7);
        assertEquals(7, rectangle.getWidth());
    }

    @Test
    void calculateArea() {
        assertEquals(24, rectangle.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(20, rectangle.calculateCircumference());
    }
}