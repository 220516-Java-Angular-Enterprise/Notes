package com.revature.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    Methods meth = new Methods();

    @Test
    void add() {
        assertEquals(8, meth.add(6, 2));
        assertEquals(106, meth.add(6, 100));
        assertEquals(-3, meth.add(-5, 2));
        assertEquals(1000, meth.add(600, 400));
        assertEquals(1005, meth.add(6, 999));
    }

    @Test
    void hello() {
        assertEquals("hello", meth.hello(4));
        assertEquals("hello", meth.hello(88));
        assertEquals("hello", meth.hello(-99998));
        assertEquals("goodbye", meth.hello(3));
        assertEquals("goodbye", meth.hello(888881));
        assertEquals("goodbye", meth.hello(-42647));
    }
}