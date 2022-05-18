package com.revature.myAssignment;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

class ComparePerTest {
    Rectangle a = new Rectangle("First", 10, 20);
    Rectangle b = new Rectangle("Second", 20, 30);
    ComparePer per = new ComparePer();

    @Test
    void isLessThan() {
        assertEquals(true, per.isLessThan(a, b));
        assertEquals(false, per.isLessThan(b, a));
        assertEquals(false, per.isLessThan(a, a));
        a.setLength(-30); a.setWidth(-40);
        assertEquals(true, per.isLessThan(a, b));
    }
}