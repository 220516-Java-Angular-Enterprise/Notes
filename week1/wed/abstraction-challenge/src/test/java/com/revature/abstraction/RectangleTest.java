package com.revature.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rec = new Rectangle(3.0, 5.0);;

    @Test
    void calculateArea() {
        double recArea = rec.calculateArea();

        assertEquals(15, recArea);
    }

    @Test
    void calculateCircumference() {
        double recPerimeter = rec.calculateCircumference();

        assertEquals(16, recPerimeter);
    }
}