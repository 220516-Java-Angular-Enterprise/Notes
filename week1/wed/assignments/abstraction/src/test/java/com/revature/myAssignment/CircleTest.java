package com.revature.myAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c = new Circle(10.0);

    @Test
    void getRadius() {
        assertEquals(10.0, c.getRadius());
    }

    @Test
    void setRadius() {
        c.setRadius(20.0);
        assertEquals(20.0, c.getRadius());
    }

    @Test
    void calculatedArea() {
        c.setRadius(1.0);
        assertEquals(Math.PI, c.calculatedArea());
    }

    @Test
    void calculateCircumference() {
        c.setRadius(1.0);
        assertEquals(Math.PI * 2, c.calculateCircumference());
    }
}