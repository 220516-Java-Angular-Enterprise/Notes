package com.revature.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment_1Test {
    Assignment_1 assignment = new Assignment_1();

    @Test
    void problemEasy() {
        assertEquals("sum = 7", assignment.problemEasy(2,5));
    }

    @Test
    void problemModerate() {
        assertEquals("YES", assignment.problemModerate(2));
        assertEquals("NO", assignment.problemModerate(7));
    }

    @Test
    void bossSlayer() {
        assertEquals("l10n", assignment.bossSlayer("localization"));
        assertEquals("local", assignment.bossSlayer("local"));
    }
}