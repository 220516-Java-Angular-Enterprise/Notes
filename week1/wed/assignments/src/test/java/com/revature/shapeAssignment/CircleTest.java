package com.revature.shapeAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle = new Circle(5, 2, 3);
    @Test
    void calculateArea() {
        assertEquals(28.27,
                circle.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(18.85,
                circle.calculateCircumference());
    }

    @Test
    void getRadius() {
        assertEquals(3, circle.getRadius());
    }

    @Test
    void setRadius() {
        circle.setRadius(5);
        assertEquals(5, circle.getRadius());
    }
}