package com.revature.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorPerimeterTest {

    ComparatorPerimeter compP = new ComparatorPerimeter();
    Rectangle a = new Rectangle("bigArea", 10, 4);
    Rectangle b = new Rectangle("bigPerimeter", 12, 3);
    @Test
    void isLessThan() {
        assertEquals(true, compP.isLessThan(a,b));
    }
}