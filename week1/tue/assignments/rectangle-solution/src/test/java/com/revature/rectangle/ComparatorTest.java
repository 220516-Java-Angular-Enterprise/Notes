package com.revature.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest {
    Comparator comparator = new Comparator();

    @Test
    void isLessThanArea() {
        Rectangle rec1 = new Rectangle("1", 100, 200);
        Rectangle rec2 = new Rectangle("2", 1001, 200);
        Rectangle rec3 = new Rectangle("3", 1, 1);

        assertTrue(comparator.isLessThanArea(rec1, rec2));
        assertTrue(comparator.isLessThanArea(rec3, rec2));

        assertFalse(comparator.isLessThanArea(rec2, rec3));
        assertFalse(comparator.isLessThanArea(rec1, rec3));
    }

    @Test
    void isLessThanPerimeter() {
        Rectangle rec1 = new Rectangle("1", 500, 500);
        Rectangle rec2 = new Rectangle("2", 100, 100);
        Rectangle rec3 = new Rectangle("3", 600, 600);

        assertTrue(comparator.isLessThanPerimeter(rec2, rec1));
        assertTrue(comparator.isLessThanPerimeter(rec1, rec3));

        assertFalse(comparator.isLessThanPerimeter(rec1, rec2));
        assertFalse(comparator.isLessThanPerimeter(rec3, rec2));
    }
}