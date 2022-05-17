package com.Revature.UI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();
    @Test
    void sumOfTwoNums() {
        assertEquals(5, sol.sumOfTwoNums(3, 2));
        assertEquals(10, sol.sumOfTwoNums(10, 0));
        assertEquals(-7, sol.sumOfTwoNums(-5, -2));
        assertEquals(0, sol.sumOfTwoNums(2, -2));
        assertEquals(14, sol.sumOfTwoNums(7, 7));
    }

    @Test
    void isEven() {
        assertEquals("Even", sol.isEven(2));
        assertEquals("Even", sol.isEven(10));
        assertEquals("Even", sol.isEven(-8));
        assertEquals("Uneven", sol.isEven(1));
        assertEquals("Uneven", sol.isEven(-47));
    }

    @Test
    void finalBoss() {

    }
}