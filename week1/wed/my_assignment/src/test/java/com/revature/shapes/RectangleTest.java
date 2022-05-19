package com.revature.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle A = new Rectangle(23.1, 32.2);
    Rectangle B = new Rectangle(0, 32.2);
    Rectangle C = new Rectangle(23.1, 0);
    Rectangle D = new Rectangle(-23.1, 32.2);
    Rectangle E = new Rectangle(-23.1, -32.2);

    @Test
    void calculateArea() {
        assertEquals(743.82 ,A.calculateArea());
        assertEquals(0, B.calculateArea());
        assertEquals(0, C.calculateArea());
        assertEquals(-743.82, D.calculateArea());
        assertEquals(743.82, E.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(110.6 ,A.calculateCircumference());
        assertEquals(64.4 ,B.calculateCircumference());
        assertEquals(46.2 ,C.calculateCircumference());
        assertEquals(18.2 ,D.calculateCircumference());
        assertEquals(-110.6 ,E.calculateCircumference());
    }



}