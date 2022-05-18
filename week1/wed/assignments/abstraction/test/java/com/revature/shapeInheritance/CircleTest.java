package com.revature.shapeInheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c = new Circle(4.0);

    @Test
    void getRadius() {
        Assertions.assertEquals(4.0, c.getRadius());
        Assertions.assertNotEquals(4, c.getRadius());
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