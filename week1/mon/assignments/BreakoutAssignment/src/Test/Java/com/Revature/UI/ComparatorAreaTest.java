package com.Revature.UI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorAreaTest {

    ComparatorArea cArea = new ComparatorArea();

    @Test
    void isLessThan() {
        assertEquals(true, cArea.isLessThan(new Rectangle("",1,1), new Rectangle("", 5, 5) ) );
    }
}