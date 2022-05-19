package com.revature.rectangles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UITest {

    @Test
    void main() {
        Rectangle test1 = new Rectangle(5.0,9.0);
        Rectangle test2 = new Rectangle(4.0,8.0);
        Rectangle test3 = new Rectangle(35.0,79.0);
        Rectangle test4 = new Rectangle(12.5,7.4);
        Rectangle test5 = new Rectangle(4.0,13.0);
        assertEquals(45,test1.height * test1.width);
        assertEquals(32,test2.height * test2.width);
        assertEquals(2765,test3.height * test3.width);
        assertEquals(92.5,test4.height * test4.width);
        assertEquals(52,test5.height * test5.width);
        //testing perimeter of rectangle
        assertEquals(28,2*(test1.height + test1.width));
        assertEquals(24,2*(test2.height + test2.width));
        assertEquals(228.0,2*((test3.height + test3.width)));
        assertEquals(39.8,2*(test4.height + test4.width));
        assertEquals(34,2*(test5.height + test5.width));

        //testing circle
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(1.2);
        Circle circle3 = new Circle(51.63);
        Circle circle4 = new Circle(83.2);
        Circle circle5 = new Circle(0.12);
        assertEquals(25,circle1.getRadius() * circle1.getRadius());
        assertEquals(1.44,circle2.getRadius()*circle2.getRadius());
        assertEquals(2665.6569000000004,circle3.getRadius()*circle3.getRadius());
        assertEquals(6922.240000000001,circle4.getRadius()*circle4.getRadius());
        assertEquals(0.0144,circle5.getRadius()*circle5.getRadius());


        //testing circumference of circle

        assertEquals(31.41592653589793,circle1.getRadius() * Math.PI * 2);
        assertEquals(7.5398223686155035,circle2.getRadius() * Math.PI * 2);
        assertEquals(324.40085740968203,circle3.getRadius() * Math.PI * 2);
        assertEquals(522.7610175573416,circle4.getRadius() * Math.PI * 2);
        assertEquals(0.7539822368615503,circle5.getRadius() * Math.PI * 2);

        Triangle triangle1 = new Triangle(7,7);
        Triangle triangle2 = new Triangle(6,6);
        Triangle triangle3 = new Triangle(5.3,5.3);
        Triangle triangle4 = new Triangle(99.4,99.4);
        Triangle triangle5 = new Triangle(18.32,18.32);


        //perimeter of Equilateral Triangle

        assertEquals(10.5,(triangle1.getBase()*3)/2);
        assertEquals(9,(triangle2.getBase()*3)/2);
        assertEquals(7.949999999999999,(triangle3.getBase()*3)/2);
        assertEquals(149.10000000000002,(triangle4.getBase()*3)/2);
        assertEquals(27.48,(triangle5.getBase()*3)/2);
    }
}