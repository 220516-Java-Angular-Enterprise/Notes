package com.revature.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EricCompareTest {

    EricCompare comp = new EricCompare();

    @Test
     void areaIsLessThan() {

        // case 1: a < b
        assertTrue(comp.areaIsLessThan(new EricRectangle("a", 1, 1), new EricRectangle("b", 5, 8)));

        // case 2: a > b
        assertFalse(comp.areaIsLessThan(new EricRectangle("b", 5, 8),new EricRectangle("a", 1, 1)));

        // case 3: a == b
        assertFalse(comp.areaIsLessThan(new EricRectangle("b", 5, 8),new EricRectangle("a", 5, 8)));
    }

    @Test
    void perimeterIsLessThan() {
        // case 1: a < b
        assertTrue(comp.perimeterIsLessThan(new EricRectangle("a", 1, 1), new EricRectangle("b", 5, 8)));

        // case 2: a > b
        assertFalse(comp.perimeterIsLessThan(new EricRectangle("b", 5, 8),new EricRectangle("a", 1, 1)));

        // case 3: a == b
        assertFalse(comp.perimeterIsLessThan(new EricRectangle("b", 5, 8),new EricRectangle("a", 5, 8)));
    }

}