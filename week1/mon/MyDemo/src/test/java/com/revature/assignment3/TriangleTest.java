package com.revature.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle();
    Triangle triangle1 =  new Triangle();
    Triangle triangle2 = new Triangle();
    Triangle triangle3 = new Triangle();
    @Test
    void getBase() {
        triangle.setBase(10);
        triangle1.setBase(1);
        triangle2.setBase(6.33);
        triangle3.setBase(1000);

        assertEquals(10, triangle.getBase());
        assertEquals(1, triangle1.getBase());
        assertEquals(6.33, triangle2.getBase());
        assertEquals(1000, triangle3.getBase());



    }

    @Test
    void setBase() {

        Triangle triangle =new Triangle(5, 3);
        Triangle triangle1 =new Triangle(1, 4);
        Triangle triangle2 =new Triangle(3.2, 10.5);
        Triangle triangle3 =new Triangle(100, 90);

        assertEquals(3, triangle.getBase());
        assertEquals(4, triangle1.getBase());
        assertEquals(10.5, triangle2.getBase());
        assertEquals(90, triangle3.getBase());


    }

    @Test
    void getHeight() {

        triangle.setHeight(10);
        triangle1.setHeight(1);
        triangle2.setHeight(6.33);
        triangle3.setHeight(1000);

        assertEquals(10, triangle.getHeight());
        assertEquals(1, triangle1.getHeight());
        assertEquals(6.33, triangle2.getHeight());
        assertEquals(1000, triangle3.getHeight());
    }

    @Test
    void setHeight() {

        Triangle triangle =new Triangle(5, 3);
        Triangle triangle1 =new Triangle(1, 4);
        Triangle triangle2 =new Triangle(3.2, 10.5);
        Triangle triangle3 =new Triangle(100, 90);

        assertEquals(5, triangle.getHeight());
        assertEquals(1, triangle1.getHeight());
        assertEquals(3.2, triangle2.getHeight());
        assertEquals(100, triangle3.getHeight());


    }

    @Test
    void calculateArea() {

        Triangle triangle1 = new Triangle(20, 10);
        Triangle triangle2 = new Triangle(12.5, 10.5);
        Triangle triangle3 = new Triangle(200, 20);
        Triangle triangle4 = new Triangle(1, 2);

        assertEquals((triangle1.getHeight()* triangle1.getBase())/2, triangle1.calculateArea());
        assertEquals((triangle2.getHeight()* triangle2.getBase())/2, triangle2.calculateArea());
        assertEquals((triangle3.getHeight()* triangle3.getBase())/2, triangle3.calculateArea());
        assertEquals((triangle4.getHeight()* triangle4.getBase())/2, triangle4.calculateArea());
    }

    @Test
    void calculateCircumference() {
        Triangle triangle1 = new Triangle(20, 10);
        Triangle triangle2 = new Triangle(12.5, 10.5);
        Triangle triangle3 = new Triangle(200, 20);
        Triangle triangle4 = new Triangle(1, 2);

        assertEquals((3* triangle1.getBase()), triangle1.calculateCircumference());
        assertEquals((3* triangle2.getBase()), triangle2.calculateCircumference());
        assertEquals((3* triangle3.getBase()), triangle3.calculateCircumference());
        assertEquals((3* triangle4.getBase()), triangle4.calculateCircumference());



    }
}