package com.revature.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle = new Circle(0,0,2);

    @Test
    void getRadius() {
        assertEquals(2, circle.getRadius());
    }

    @Test
    void setRadius() {
        circle.setRadius(10);
        assertEquals(10, circle.getRadius());
    }

    @Test
    void calculateArea() {
        assertEquals(12.57, circle.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(12.57, circle.calculateCircumference());
    }
}