package com.revature.assignment3;

import com.revature.assignment3.util.TestHelpers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private final String fail = "Test failed at triangle ";
    private double[] bases = {
            0.0, 8.0, -2.5, 0.00390625, 0, 41.1
    };
    private double[] heights = {
            0.0, 1, 98.012, -0, -0.00132, 21
    };
    private double[] testBases = {
            0.0, 8.0, 2.5, 0.00390625, 0.0, 41.1
    };
    private double[] testHeights = {
            0.0, 1.0, 98.012, 0.0, 0.00132, 21
    };
    private double[] testArea = {
            0.00, 4.00, 122.515, 0.0, 0.0, 431.55
    };
    private double[] testCirc = {
            0.0, 16.246, 198.539, 0.00781, 0.00264, 99.864
    };
    private Triangle[] triangles = new Triangle[bases.length];

    TriangleTest() {
        Arrays.setAll(triangles, i -> new Triangle(bases[i], heights[i]));
    }

    @Test
    void getBase() {
        for (int i = 0; i < triangles.length; i++) {
            try {
                assertEquals(testBases[i], triangles[i].getBase());
            }
            catch (AssertionError a) {
                System.out.println("Base "+fail+i);
            }
        }
    }

    @Test
    void setBase() {
        triangles[0].setBase(4.3);
        assertEquals(4.3, triangles[0].getBase());
        triangles[0].setBase(-12);
        assertEquals(12.0, triangles[0].getBase());
        triangles[0].setBase(-0);
        assertEquals(0.0, triangles[0].getBase());
    }

    @Test
    void getHeight() {
        for (int i = 0; i < triangles.length; i++) {
            try {
                Assertions.assertEquals(testHeights[i], triangles[i].getHeight());
            }
            catch (AssertionError a) {
                System.out.println("Height "+fail+i);
            }
        }
    }

    @Test
    void setHeight() {
        triangles[0].setHeight(1215641.1215512131);
        assertEquals(1215641.1215512131, triangles[0].getHeight());
        triangles[0].setHeight(-12.3);
        assertEquals(12.3, triangles[0].getHeight());
        triangles[0].setHeight(0.0000);
        assertEquals(0.0, triangles[0].getHeight());
    }

    @Test
    void calculateArea() {
        for (int i = 0; i < triangles.length; i++) {
            try {
                assertFalse(
                        TestHelpers.equalsWithPrecision(
                                String.valueOf(triangles[i].calculateArea()),
                                String.valueOf(testArea[i]), 2) < 2);
            }
            catch (AssertionError a) {
                System.out.println("Area "+fail+i);
            }
        }
    }

    @Test
    void calculateCircumference() {
        for (int i = 0; i < triangles.length; i++) {
            try {
                assertFalse(
                        TestHelpers.equalsWithPrecision(
                                String.valueOf(triangles[i].calculateCircumference()),
                                String.valueOf(testCirc[i]), 2) < 2);
            }
            catch (AssertionError a) {
                System.out.println("Circumference "+fail+i);
            }
        }
    }
}