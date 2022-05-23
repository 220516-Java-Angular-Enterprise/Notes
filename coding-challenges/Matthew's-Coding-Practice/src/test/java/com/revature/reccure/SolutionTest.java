package com.revature.reccure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();

    @Test
    void recurringInt() {
        assertEquals(2, sol.recurringInt("11222111"));
        assertEquals(1, sol.recurringInt("111222333444"));
        assertEquals(4, sol.recurringInt("1223334444"));
        assertEquals(0, sol.recurringInt(""));
        assertEquals(1, sol.recurringInt("1"));
        assertEquals(7, sol.recurringInt("11999991188881122222211777777711"));
    }
}