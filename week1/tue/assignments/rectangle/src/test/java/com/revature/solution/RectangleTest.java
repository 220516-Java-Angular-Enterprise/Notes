package com.revature.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {
    Rectangle r = new Rectangle("1",4,5);

    @Test
    void area() {
        Assertions.assertEquals(4*5, r.area());
    }

    @Test
    void perimeter() {
        Assertions.assertEquals(2*(4+5),r.perimeter());
    }

    @Test
    void testToString() {
        Assertions.assertEquals(
                "Rectangle 1\tLength: 4\tWidth: 5\tArea: 20\tPerimeter: 18",
                r.toString());
    }
}