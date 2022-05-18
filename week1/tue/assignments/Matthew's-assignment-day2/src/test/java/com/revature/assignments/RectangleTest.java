package com.revature.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rec = new Rectangle("Jim", 10 , 4);
    Rectangle comp1 = new Rectangle("Compare1", 10, 4);
    Rectangle comp2 = new Rectangle("Compare2", 12, 3);
    Rectangle comp3 = new Rectangle("Compare3", 5, 6);
    List<Rectangle> recList = new ArrayList<>(Arrays.asList(comp1, comp2, comp3));

    @Test
    void getName() {
        assertEquals("Jim", rec.getName());
    }

    @Test
    void setName() {
        rec.setName("tim");
        assertEquals("tim", rec.getName());
    }

    @Test
    void getLength() {
        assertEquals(10, rec.getLength());
    }

    @Test
    void setLength() {
        rec.setLength(3);
        assertEquals(3, rec.getLength());
    }

    @Test
    void getWidth() {
        assertEquals(4, rec.getWidth());
    }

    @Test
    void setWidth() {
        rec.setWidth(7);
        assertEquals(7, rec.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(40, rec.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(28, rec.getPerimeter());
    }

    @Test
    void findMaxArea() {
        assertEquals(comp1 ,rec.findMaxArea(recList));
    }

    @Test
    void findMaxPerimeter() {
        assertEquals(comp2 ,rec.findMaxPerimeter(recList));
    }

    @Test
    void testToString() {
    }
}