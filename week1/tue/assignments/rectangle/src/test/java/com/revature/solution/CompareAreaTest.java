package com.revature.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CompareAreaTest {
    CompareArea a = new CompareArea();
    Rectangle[] r = {
            new Rectangle("pole", 250, 1),
            new Rectangle("box", 16, 16),
            new Rectangle("d6", 4,4),
            new Rectangle("tv", 960,540),
            new Rectangle("card", 6,3)
    };

    @Test
    void isLessThan() {
        Assertions.assertTrue(a.isLessThan(r[0], r[1]));
        Assertions.assertFalse(a.isLessThan(r[1], r[2]));
        Assertions.assertTrue(a.isLessThan(r[1], r[3]));
        Assertions.assertFalse(a.isLessThan(r[3], r[4]));
    }
}