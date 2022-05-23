package com.revature.CodingChallenge;

import static org.junit.jupiter.api.Assertions.*;

class CodingChallengeTest {



    CodingChallenge sol = new CodingChallenge();

    void mostRecurringInteger() {
        assertEquals(2, sol.mostRecurringInteger("11222111"));
        assertEquals(1, sol.mostRecurringInteger("111222333444"));
        assertEquals(4, sol.mostRecurringInteger("1223334444"));
        assertEquals(0, sol.mostRecurringInteger(""));
        assertEquals(1, sol.mostRecurringInteger("1"));
        assertEquals(7, sol.mostRecurringInteger("11999991188881122222211777777711"));
    }
}
