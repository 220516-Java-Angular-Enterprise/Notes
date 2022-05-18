package com.revature.myAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareAreaTest {
    Rectangle a = new Rectangle("First", 10, 20);
    Rectangle b = new Rectangle("Second", 20, 30);
    CompareArea area = new CompareArea();

    @Test
    void isLessThan() {
        assertEquals(true, area.isLessThan(a, b));
        assertEquals(false, area.isLessThan(b, a));
        assertEquals(false, area.isLessThan(a, a));
        a.setLength(-30); a.setWidth(-40);
        assertEquals(false, area.isLessThan(a, b));
    }
}