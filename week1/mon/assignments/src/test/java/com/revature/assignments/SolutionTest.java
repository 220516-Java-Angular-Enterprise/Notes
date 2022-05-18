package com.revature.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution test = new Solution();
    @Test
    void sumOfTwoNums() {
        assertEquals(4, test.sumOfTwoNums(2,2));
        assertEquals(10, test.sumOfTwoNums(0,10));
        assertEquals(21, test.sumOfTwoNums(15,6));
        assertEquals(2422, test.sumOfTwoNums(2412,10));

    }

    @Test
    void oddOrEven() {
        assertEquals("YES", test.oddOrEven(2));
        assertEquals("NO", test.oddOrEven(22));
        assertEquals("NO", test.oddOrEven(Integer.MAX_VALUE));
    }

    @Test
    void abbreviation() {
        assertEquals("l10n", test.abbreviation("localization"));
        assertEquals("i18n", test.abbreviation("internationalization"));
        assertEquals("word", test.abbreviation("word"));
    }
}