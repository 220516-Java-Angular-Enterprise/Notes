package com.revature.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();

    @Test
    void mostRecurringInteger() {
        assertEquals(2, sol.mostRecurringInteger("11222111"));
        assertEquals(1, sol.mostRecurringInteger("111222333444"));
        assertEquals(4, sol.mostRecurringInteger("1223334444"));
        assertEquals(0, sol.mostRecurringInteger(""));
        assertEquals(1, sol.mostRecurringInteger("1"));
        assertEquals(7, sol.mostRecurringInteger("11999991188881122222211777777711"));
        assertEquals(4, sol.mostRecurringInteger("11111122234444444444111122233111132"));
    }
}