package com.revature.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {
    Solutions testSol = new Solutions();
    @Test
    void getSum() {
        assertEquals(2,testSol.getSum(1,1));
        assertEquals(-4,testSol.getSum(-1,-3));
        assertEquals(-2,testSol.getSum(1,-3));
        assertEquals(21,testSol.getSum(10,11));
        assertEquals(0,testSol.getSum(0,0));

    }

    @Test
    void isEven() {
        assertEquals("ODD",testSol.isEven(3));
        assertEquals("EVEN",testSol.isEven(0));
        assertEquals("EVEN",testSol.isEven(4));
        assertEquals("EVEN",testSol.isEven(-10));
        assertEquals("ODD",testSol.isEven(-7));
    }

    @Test
    void truncate() {
        assertEquals("word",testSol.truncate("word"));
        assertEquals("n10e",testSol.truncate("normalizable"));
        assertEquals("dodecagons",testSol.truncate("dodecagons"));
        assertEquals("P43s",testSol.truncate("Pneumonoultramicroscopicsilicovolcanoconiosis"));
        assertEquals("",testSol.truncate(""));

    }
}