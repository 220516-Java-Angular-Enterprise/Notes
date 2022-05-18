package com.revature.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle r = new Rectangle();

    @Test
    void setHeight() throws MeasurementException {
        r.setHeight(5);
        assertEquals(5, r.getHeight());
        // negative should throw error
        assertThrows(MeasurementException.class,()-> r.setHeight(-1));
    }

    @Test
    void setWidth() throws MeasurementException {
        r.setWidth(5);
        assertEquals(5, r.getWidth());
        // negative should throw error
        assertThrows(MeasurementException.class,()-> r.setWidth(-1));
    }

    @Test
    void calculateArea() throws MeasurementException {
        r.setWidth(1);
        r.setHeight(1);
        assertEquals(1, r.calculateArea());

        r.setHeight(5);
        r.setWidth(8);
        assertEquals(40,r.calculateArea());

    }

    @Test
    void calculateCircumference() throws MeasurementException {
        r.setWidth(1);
        r.setHeight(1);
        assertEquals(4, r.calculateCircumference());

        r.setHeight(5);
        r.setWidth(8);
        assertEquals(26,r.calculateCircumference());
    }
}