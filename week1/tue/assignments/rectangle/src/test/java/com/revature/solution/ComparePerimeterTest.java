package com.revature.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparePerimeterTest {
    ComparePerimeter p = new ComparePerimeter();
    Rectangle[] r = {
            new Rectangle("pole", 250, 1),
            new Rectangle("box", 16, 16),
            new Rectangle("d6", 4,4),
            new Rectangle("tv", 960,540),
            new Rectangle("card", 6,3)
    };

    @Test
    void isLessThan() {
        Assertions.assertFalse(p.isLessThan(r[0],r[1]));
        Assertions.assertFalse(p.isLessThan(r[0],r[2]));
        Assertions.assertTrue(p.isLessThan(r[0],r[3]));
        Assertions.assertFalse(p.isLessThan(r[3],r[4]));
    }
}