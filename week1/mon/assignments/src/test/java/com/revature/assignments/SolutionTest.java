package com.revature.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
Solution sol = new Solution();

    @Test
    void sumOfTwoNum() {
        assertEquals(4, sol.sumOfTwoNum(2, 2));
        assertEquals(10, sol.sumOfTwoNum(3, 7));
        assertEquals(-5, sol.sumOfTwoNum(-3, -2));
        assertEquals(-20, sol.sumOfTwoNum(-40, 20));
        assertEquals(222222, sol.sumOfTwoNum(111111, 111111));

    }

    @Test
    void evenOdd() {
        assertEquals("EVEN", sol.evenOdd(4));
        assertEquals("ODD", sol.evenOdd(3));
        assertEquals("EVEN", sol.evenOdd(2459232));
        assertEquals("ODD", sol.evenOdd(-31));
        assertEquals("EVEN", sol.evenOdd(0));

    }

    @Test
    void abr() {
        assertEquals("w20w", sol.abr("w20w"));
        assertEquals("22", sol.abr("22"));
        assertEquals("n", sol.abr("n"));
        assertEquals("r12d", sol.abr("reallylongword"));
        assertEquals("R10H", sol.abr("RoooOooooDuH"));
    }
}