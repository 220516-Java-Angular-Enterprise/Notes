package com.revature.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c = new Circle();

    @Test
    void setRadius() throws MeasurementException{
        // positive
        c.setRadius(5);
        assertEquals(5,c.getRadius());
        // negative
        assertThrows(MeasurementException.class,() -> c.setRadius(-1));
    }

    @Test
    void calculateArea() throws MeasurementException {
        // r = 1
        c.setRadius(1);
        assertEquals(Math.PI,c.calculateArea());
        // r = 5
        c.setRadius(5);
        assertEquals(Math.PI*Math.pow(5,2), c.calculateArea());
    }

    @Test
    void calculateCircumference() throws MeasurementException {
        // r = 1
        c.setRadius(1);
        assertEquals(2*Math.PI,c.calculateCircumference());
        // r = 5
        c.setRadius(5);
        assertEquals(2*Math.PI*5, c.calculateCircumference());
    }


}