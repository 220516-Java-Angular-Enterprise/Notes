package com.revature.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle test = new Triangle(7.0, 4.0);


    @Test
    void getHeight() {
        assertEquals(7.0, test.getHeight());
    }

    @Test
    void setHeight() {
        test.setHeight(5.0);
        assertEquals(5.0, test.getHeight());
    }

    @Test
    void getBase() {
        assertEquals(4.0,test.getBase());
    }

    @Test
    void setBase() {
        test.setBase(9.0);
        assertEquals(9.0, test.getBase());
    }

    @Test
    void calculateArea() {
        assertEquals(14, test.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(12, test.calculateCircumference());
    }
}