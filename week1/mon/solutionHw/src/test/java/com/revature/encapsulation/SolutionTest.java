package com.revature.encapsulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

//    need to make a new object so that we can run tests
    Solution sol = new Solution();

//    write at least 5-10 tests
    @Test
    void sumOfTwoNumbers() {
        assertEquals(4, sol.sumOfTwoNumbers(2,2));
        assertEquals(-2, sol.sumOfTwoNumbers(-1, -1));
        assertEquals(10, sol.sumOfTwoNumbers(0, 10));
        assertEquals(2000, sol.sumOfTwoNumbers(1000,1000));
        assertEquals(1, sol.sumOfTwoNumbers(-3, 4));
    }

    @Test
    void evenOdd() {
        assertEquals("EVEN", sol.evenOdd(2));
        assertEquals("ODD", sol.evenOdd(3));
        assertEquals("EVEN", sol.evenOdd(0));
        assertEquals("ODD", sol.evenOdd(-91));
        assertEquals("ODD", sol.evenOdd(Integer.MAX_VALUE));
    }

    @Test
    void abr() {
        assertEquals("l10n", sol.abr("localization"));
        assertEquals("word" , sol.abr("word"));
        assertEquals("m12e" , sol.abr("meganlabrecque"));
        assertEquals("s" , sol.abr("s"));
        assertEquals("" , sol.abr(""));
        assertEquals("s9e" , sol.abr("space space"));
    }
}