package com.revature.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle t = new Triangle();

    @Test
    void setHeight() throws MeasurementException {
        t.setHeight(1);
        assertEquals(1, t.getHeight());
        // negative
        assertThrows(MeasurementException.class, ()-> t.setHeight(-1));
    }

    @Test
    void setBase() throws MeasurementException {
        t.setBase(1);
        assertEquals(1, t.getBase());
        // negative
        assertThrows(MeasurementException.class, ()-> t.setBase(-1));
    }

    @Test
    void calculateArea() throws MeasurementException {
        t.setBase(1);
        t.setHeight(1);
        assertEquals(.5,t.calculateArea());

        t.setBase(5);
        t.setHeight(8);
        assertEquals(20,t.calculateArea());
    }

    @Test
    void calculateCircumference() throws MeasurementException {
        t.setBase(1);
        t.setHeight(1);
        assertEquals(3,t.calculateCircumference());

        t.setBase(5);
        t.setHeight(8);
        assertEquals(15,t.calculateCircumference());


    }
}