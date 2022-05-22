package com.revature.wednesdayassignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c1;

    {
        c1 = new Circle(5, 5, 10.0);
    }

    @Test
    void getRadius() {
        assertEquals(27.83, c1.calculateArea());
    }

    @Test
    void setRadius() {
    }

    @Test
    void calculateArea() {
    }

    @Test
    void calculateCircumference() {
    }
}