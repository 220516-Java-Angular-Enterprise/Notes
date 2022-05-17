package com.revature.assignments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment1Test {

    @Test
    void sum() {
        Assertions.assertEquals("sum = 0",Assignment1.sum(-1,1));
        Assertions.assertEquals("sum = 4",Assignment1.sum(2,2));
        Assertions.assertEquals("sum = -3",Assignment1.sum(-1,-2));
        Assertions.assertEquals("sum = 6",Assignment1.sum(10,-4));
        Assertions.assertEquals("sum = 13",Assignment1.sum(6,7));
    }

    @Test
    void isEven() {
        Assertions.assertEquals("YES", Assignment1.isEven(4));
        Assertions.assertEquals("NO", Assignment1.isEven(3));
        Assertions.assertEquals("YES", Assignment1.isEven(0));
        Assertions.assertEquals("NO", Assignment1.isEven(-9));
        Assertions.assertEquals("YES", Assignment1.isEven(-10));
    }

    @Test
    void abbreviate() {
        Assertions.assertEquals("ionization", Assignment1.abbreviate("ionization"));
        Assertions.assertEquals("legitamize", Assignment1.abbreviate("legitamize"));
        Assertions.assertEquals("l10n", Assignment1.abbreviate("localizaiton"));
        Assertions.assertEquals("A9s", Assignment1.abbreviate("Assignments"));
    }
}