package com.revature.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle t = new Triangle(10.0, 5.0);

    @Test
    void calculateArea() {
        double tArea = t.calculateArea();

        assertEquals(25, tArea);
    }

    @Test
    void calculateCircumference() {
        double tPerimeter = t.calculateCircumference();

        assertEquals(15, tPerimeter);
    }
}