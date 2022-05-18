package com.revature.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {


    Circle test = new Circle(8.0);

    @Test
    void getRadius() {
        assertEquals(8.0, test.getRadius());
    }

    @Test
    void setRadius() {
        test.setRadius(4.0);
        assertEquals(4.0,test.getRadius());
    }


    @Test
    void calculateArea() {
        assertEquals(201.06,test.calculateArea());
    }

    @Test
    void calculateCircumference() {
        assertEquals(50.26, test.calculateCircumference());
    }
}