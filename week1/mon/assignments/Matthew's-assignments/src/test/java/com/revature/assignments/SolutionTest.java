package com.revature.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();

    @Test
    void sumOfTwoNum() {
        assertEquals(4,sol.sumOfTwoNum(2,2));
        assertEquals(0,sol.sumOfTwoNum(-1,1));
    }

    @Test
    void evenOdd() {
        assertEquals("NO",sol.evenOdd(3));
    }

    @Test
    void abbreviation() {
        assertEquals("l10n",sol.abbreviation("localization"));
    }
}