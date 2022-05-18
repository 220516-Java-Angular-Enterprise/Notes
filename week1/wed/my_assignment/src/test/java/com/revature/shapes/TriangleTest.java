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
        assertEquals(0.09, E.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(60.3 ,A.calculateCircumference());
        assertEquals(0 ,B.calculateCircumference());
        assertEquals(-20.1 ,C.calculateCircumference());
        assertEquals(60.3 ,D.calculateCircumference());
        assertEquals(2.67 ,E.calculateCircumference());
    }

    @Test
    void getHeight() {
        assertEquals(333.2 ,A.getHeight());
        assertEquals(333.2 ,B.getHeight());
        assertEquals(0 ,C.getHeight());
        assertEquals(-333.23 ,D.getHeight());
        assertEquals(.22 ,E.getHeight());
    }

    @Test
    void getBase() {
        assertEquals(20.1 ,A.getBase());
        assertEquals(0 ,B.getBase());
        assertEquals(-20.1 ,C.getBase());
        assertEquals(20.1 ,D.getBase());
        assertEquals(0.89 ,E.getBase());
    }

}