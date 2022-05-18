package com.revature.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorAreaTest {

    ComparatorArea compA = new ComparatorArea();
    Rectangle a = new Rectangle("bigArea", 10, 4);
    Rectangle b = new Rectangle("bigPerimeter", 12, 3);
    @Test
    void isLessThan() {
        assertEquals(false, compA.isLessThan(a,b));
    }
}