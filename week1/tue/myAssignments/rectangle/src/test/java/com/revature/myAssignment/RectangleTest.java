package com.revature.myAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rect = new Rectangle("Test 1", 10, 20);
    Rectangle a = new Rectangle("Test 2", 20, 30);


    @Test
    void getArea() {
        assertEquals(200, rect.getArea());
        assertEquals(600, a.getArea());
    }

    @Test
    void getPer() {
        assertEquals(60, rect.getPer());
        assertEquals(100, a.getPer());
    }

    @Test
    void findMaxArea() {
        assertEquals(a, rect.findMaxArea(a));
        a.setWidth(5); a.setLength(5);
        assertEquals(rect, rect.findMaxArea(a));
    }

    @Test
    void findMaxPer() {
        assertEquals(a, rect.findMaxPer(a));
        a.setWidth(5); a.setLength(5);
        assertEquals(rect, rect.findMaxPer(a));
    }
}