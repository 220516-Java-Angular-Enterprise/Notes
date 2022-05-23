package com.revature.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rectangleTest {
    rectangle rec = new rectangle();
    rectangle rec1 = new rectangle();
    rectangle rec2 = new rectangle();
    rectangle rec3 = new rectangle();
    @Test

    void getWidth() {
        rec.setWidth(10);
        rec1.setWidth(0);
        rec2.setWidth(6.33);
        rec3.setWidth(1000);

        assertEquals(10, rec.getWidth());
        assertEquals(0, rec1.getWidth());
        assertEquals(6.33, rec2.getWidth());
        assertEquals(1000, rec3.getWidth());

    }

    @Test
    void setWidth() {
        rectangle rec1 = new rectangle(20, 10);
        rectangle rec2 = new rectangle(20, 12.4);
        rectangle rec3 = new rectangle(20000, 1000);
        rectangle rec4 = new rectangle(20, 1);


        assertEquals(10, rec1.getWidth());
        assertEquals(12.4, rec2.getWidth());
        assertEquals(1000, rec3.getWidth());
        assertEquals(1, rec4.getWidth());

    }

    @Test
    void getHeight() {
        rec.setHeight(10);
        rec1.setHeight(0);
        rec2.setHeight(6.33);
        rec3.setHeight(1000);

        assertEquals(10, rec.getHeight());
        assertEquals(0, rec1.getHeight());
        assertEquals(6.33, rec2.getHeight());
        assertEquals(1000, rec3.getHeight());
    }

    @Test
    void setHeight() {
        rectangle rec1 = new rectangle(20, 10);
        rectangle rec2 = new rectangle(40.5, 12.4);
        rectangle rec3 = new rectangle(1000, 900);
        rectangle rec4 = new rectangle(2, 1);
        assertEquals(20, rec1.getHeight());
        assertEquals(40.5, rec2.getHeight());
        assertEquals(1000, rec3.getHeight());
        assertEquals(2, rec4.getHeight());
    }

    @Test
    void calculateArea() {
        rectangle rec1 = new rectangle(20, 10);
        rectangle rec2 = new rectangle(40.5, 12.4);
        rectangle rec3 = new rectangle(1000, 900);
        rectangle rec4 = new rectangle(2, 1);

        assertEquals(rec1.getHeight()* rec1.getWidth(), rec1.calculateArea());
        assertEquals(rec2.getHeight()* rec2.getWidth(), rec2.calculateArea());
        assertEquals(rec3.getHeight()* rec3.getWidth(), rec3.calculateArea());
        assertEquals(rec4.getHeight()* rec4.getWidth(), rec4.calculateArea());
    }

    @Test
    void calculateCircumference() {
        rectangle rec1 = new rectangle(20, 10);
        rectangle rec2 = new rectangle(40.5, 12.4);
        rectangle rec3 = new rectangle(1000, 900);
        rectangle rec4 = new rectangle(2, 1);

        assertEquals(2*(rec1.getHeight()+rec1.getWidth()), rec1.calculateCircumference());
        assertEquals(2*(rec2.getHeight()+rec2.getWidth()), rec2.calculateCircumference());
        assertEquals(2*(rec3.getHeight()+rec3.getWidth()), rec3.calculateCircumference());
        assertEquals(2*(rec4.getHeight()+rec4.getWidth()), rec4.calculateCircumference());
    }
}
