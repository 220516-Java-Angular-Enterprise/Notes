package com.revature.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle A = new Circle(12.3);
    Circle B = new Circle(-12.3);
    Circle C = new Circle(0);
    Circle D = new Circle(120);
    Circle E = new Circle(.0898);

    @Test
    void calculateArea() {
        assertEquals(475.05, A.calculateArea());
        assertEquals(475.05, B.calculateArea());
        assertEquals(0, C.calculateArea());
        assertEquals(45216.0, D.calculateArea());
        assertEquals(0.03, E.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(77.24, A.calculateCircumference());
        assertEquals(-77.24, B.calculateCircumference());
        assertEquals(0, C.calculateCircumference());
        assertEquals(753.6, D.calculateCircumference());
        assertEquals(0.56, E.calculateCircumference());
    }
}


