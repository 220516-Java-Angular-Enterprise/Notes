package com.revature.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle A = new Triangle(20.1, 333.2);
    Triangle B = new Triangle(0, 333.2);
    Triangle C = new Triangle(-20.1, 0);
    Triangle D = new Triangle(20.1, -333.2);
    Triangle E = new Triangle(.89, .22);
    @Test
    void calculateArea() {
        assertEquals(3348.66 ,A.calculateArea());
        assertEquals(0, B.calculateArea());
        assertEquals(0, C.calculateArea());
        assertEquals(-3348.66, D.calculateArea());
        assertEquals(0.1, E.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(60.3 ,A.calculateCircumference());
        assertEquals(0 ,B.calculateCircumference());
        assertEquals(-60.3 ,C.calculateCircumference());
        assertEquals(60.3 ,D.calculateCircumference());
        assertEquals(2.67 ,E.calculateCircumference());
    }

}