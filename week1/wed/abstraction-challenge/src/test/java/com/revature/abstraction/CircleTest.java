package com.revature.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c;

    @Test
    void calculateArea() {
        //create new circle object with radius of 2
        c = new Circle(2);

        //assign area of new circle
        double cArea = c.calculateArea();

        assertEquals(12, Math.floor(cArea));
    }

    @Test
    void calculateCircumference() {
        calculateArea();
    }
}