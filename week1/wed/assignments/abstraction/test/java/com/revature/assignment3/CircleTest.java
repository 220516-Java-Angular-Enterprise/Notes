package com.revature.assignment3;

import com.revature.assignment3.util.TestHelpers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CircleTest {
    private final String fail = "Test failed at circle ";
    private double[] radii = {
            0.0, 8.0, -2.5, 0.00390625, 0.003, 0.125, 0.1, 41.0859375, 41.1
    };
    private double[] testRadii = {
            0.0, 8, 2.5, 0.00390625, 0.003, 0.125, 0.1, 41.0859375, 41.1
    };
    private double[] testArea = {
            0.000, 201.0619, 19.635, 4.794e-5, 2.827e-5, 0.0491, 0.0314, 5303.179,5306.809
    };

    private double[] testCirc = {
            0.000, 50.265, 15.708, 0.0245, 0.0188, 0.785, 0.628, 258.151, 258.239
    };
    private Circle[] circles = new Circle[radii.length];

    private CircleTest() {
        Arrays.setAll(circles, i -> new Circle(radii[i]));
    }

    @Test
    void getRadius() {
        int i = 0;
        while (i < circles.length) {
            try {
                Assertions.assertEquals(testRadii[i], circles[i].getRadius());
            }
            catch (AssertionError a) {
                System.out.println("Radius "+fail+i);
            }
            finally { i++; }
        }
    }

    @Test
    void setRadius() {
        circles[0].setRadius(4);
        Assertions.assertEquals(4.0, circles[0].getRadius());
        circles[0].setRadius(-4);
        Assertions.assertEquals(4.0, circles[0].getRadius());
        circles[0].setRadius(0);
        Assertions.assertEquals(0.0, circles[0].getRadius());
    }

    @Test
    void calculateArea() {
        int i = 0;
        while (i < circles.length) {
            try {
                Assertions.assertFalse(
                        TestHelpers.equalsWithPrecision(
                                String.valueOf(circles[i].calculateArea()),
                                String.valueOf(testArea[i]), 2) < 2);
            }
            catch (AssertionError a) {
                System.out.println("Area "+fail+i);
            }
            finally { i++; }
        }
    }

    @Test
    void calculateCircumference() {
        int i = 0;
        while (i < circles.length) {
            try {
                Assertions.assertFalse(
                        TestHelpers.equalsWithPrecision(
                                String.valueOf(circles[i].calculateCircumference()),
                                String.valueOf(testCirc[i]), 2) < 2);
            }
            catch (AssertionError a) {
                System.out.println("Circumference "+fail+i);
            }
            finally { i++; }
        }
    }
}