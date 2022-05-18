package com.revature.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle test = new Rectangle(5.0, 4.0);

    @Test
    void getHeight() {
        assertEquals(5.0, test.getHeight());
    }

    @Test
    void setHeight() {
        test.setHeight(3.0);
        assertEquals(3.0, test.getHeight());
    }

    @Test
    void getWidth() {
        assertEquals(4.0, test.getWidth());
    }

    @Test
    void setWidth() {
        test.setWidth(8.0);
        assertEquals(8.0, test.getWidth());
    }

    @Test
    void calculateArea() {
        assertEquals(20, test.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(18, test.calculateCircumference());
    }
}