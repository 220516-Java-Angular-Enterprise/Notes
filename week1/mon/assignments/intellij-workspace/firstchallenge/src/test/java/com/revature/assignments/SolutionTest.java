package java.com.revature.assignments;

import com.revature.assignments.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();

    @Test
    void sumtwoVals() {
        assertEquals(4, sol.sumtwoVals(2,2));
        assertEquals(1, sol.sumtwoVals(-3,4));
        assertEquals(Integer.MAX_VALUE + Integer.MAX_VALUE, sol.sumtwoVals(Integer.MAX_VALUE,Integer.MAX_VALUE));

    }

    @Test
    void evenorOdd() {
        assertEquals("Even", sol.evenorOdd(0));
        assertEquals("Odd", sol.evenorOdd(Integer.MAX_VALUE));
        assertEquals("Odd", sol.evenorOdd(3));
    }

    @Test
    void finalBoss() {
        assertEquals("l10n", sol.finalBoss("localization"));
        assertEquals("i18n", sol.finalBoss("internationalization"));
        assertEquals("", sol.finalBoss(""));
        assertEquals("s9e", sol.finalBoss("space space"));
    }
}