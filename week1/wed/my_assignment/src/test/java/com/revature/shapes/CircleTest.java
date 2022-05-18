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
        assertEquals(77.28 ,A.calculateArea());
        assertEquals(-77.28, B.calculateArea());
        assertEquals(0, C.calculateArea());
        assertEquals(753.98, D.calculateArea());
        assertEquals(0.56, E.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(475.29 ,A.calculateCircumference());
        assertEquals(475.29 ,B.calculateCircumference());
        assertEquals(475.29 ,C.calculateCircumference());
        assertEquals(475.29 ,D.calculateCircumference());
        assertEquals(475.29 ,E.calculateCircumference());
    }


    @Test
    void getRadius() {
        assertEquals(12.3 ,A.getRadius());
        assertEquals(-12.3 ,B.getRadius());
        assertEquals(0 ,C.getRadius());
        assertEquals(120 ,D.getRadius());
        assertEquals(0.89 , E.getRadius());
    }
    }

