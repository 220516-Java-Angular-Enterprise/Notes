package com.revature.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();

    @Test
    void easy() {
        assertEquals(4, sol.easy(2, 2));
        assertEquals(10, sol.easy(0, 10));
        assertEquals(-2, sol.easy(-1, -1));
        assertEquals(2000, sol.easy(1000, 1000));
        assertEquals(1, sol.easy(-3, 4));
    }

    @Test
    void moderate() {
        assertEquals("EVEN", sol.moderate(2));
        assertEquals("ODD", sol.moderate(3));
        assertEquals("EVEN", sol.moderate(0));
        assertEquals("ODD", sol.moderate(-91));
        assertEquals("ODD", sol.moderate(Integer.MAX_VALUE));
    }

    @Test
    void finalBoss() {
        assertEquals("l10n" , sol.finalBoss("localization"));
        assertEquals("i18n" , sol.finalBoss("internationalization"));
        assertEquals("s" , sol.finalBoss("s"));
        assertEquals("" , sol.finalBoss(""));
        assertEquals("s9e" , sol.finalBoss("space space"));
        assertEquals(" 10 " , sol.finalBoss("            "));
    }
}