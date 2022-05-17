package com.revature.myAssignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest extends Solution {
    Solution sol = new Solution();

    @Test
    void sumOfTwoNum() {
        assertEquals(4, sol.sumOfTwoNum(2, 2));
        assertEquals(10, sol.sumOfTwoNum(0, 10));
        assertEquals(1, sol.sumOfTwoNum(-3, 4));
    }


    @Test
    void evenOdd() {
        assertEquals("EVEN", sol.evenOdd(2));
        assertEquals("ODD", sol.evenOdd(1));
        assertEquals("EVEN", sol.evenOdd(0));
    }

    @Test
    void abbreviation() {
        assertEquals("l10n", sol.abbreviation("localization"));
        assertEquals("i18n", sol.abbreviation("internationalization"));
        assertEquals("s", sol.abbreviation("s"));
        assertEquals("", sol.abbreviation(""));
        assertEquals("s9e", sol.abbreviation("space space"));
    }
}
