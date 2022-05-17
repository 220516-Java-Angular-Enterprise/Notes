package com.revature.assingments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solTest = new Solution();


    @Test
    void sumOfTwo() {
        assertEquals(5,solTest.sumOfTwo(2,3));
        assertEquals(13,solTest.sumOfTwo(7,6));
        assertEquals(-10,solTest.sumOfTwo(3,-13));
        assertEquals(0,solTest.sumOfTwo(15,-15));
        assertEquals(930,solTest.sumOfTwo(500,430));
    }

    @Test
    void evenOdd() {
        assertEquals("This number is Even\n",solTest.evenOdd(6));
        assertEquals("This number is Odd\n",solTest.evenOdd(63));
        assertEquals("This number is Even\n",solTest.evenOdd(126));
        assertEquals("This number is Odd\n",solTest.evenOdd(-47));
        assertEquals("This number is Even\n",solTest.evenOdd(90));
    }

    @Test
    void abbrevOf10() {
        assertEquals("l10n",solTest.abbrevOf10("localization"));
        assertEquals("J12n", solTest.abbrevOf10("JeremiahBolden"));
        assertEquals("lasting",solTest.abbrevOf10("lasting"));
        assertEquals("Jo Jo", solTest.abbrevOf10("Jo Jo"));
        assertEquals(" ",solTest.abbrevOf10(" "));
    }

    @Test
    void main() {
    }
}