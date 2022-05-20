package com.revature.assignment3;

import com.revature.assignment3.util.TestHelpers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RectangleTest {
    private final String fail = "Test failed at rectangle ";
    private double[] heights =  {
            0.0, 8.0, -2.5, 0.00390625, 0, 41.1
    };
    private double[] widths = {
            0.0, 1, 98.012, -0, -0.00132, 21
    };
    private double[] testHeights = {
            0.0, 8.0, 2.5, 0.00390625, 0.0, 41.1
    };
    private double[] testWidths = {
            0.0, 1.0, 98.012, 0.0, 0.00132, 21
    };
    private double[] testArea = {
            0.000, 8.000, 245.03, 0.000, 0.000, 863.1
    };
    private double[] testCirc = {
            0.000, 18.000, 201.024, 0.00781, 0.00264, 124.2
    };
    private Rectangle[] rectangles = new Rectangle[heights.length];

    RectangleTest() {
        Arrays.setAll(rectangles, i -> new Rectangle(heights[i], widths[i]));
    }


    @Test
    void getHeight() {
        for (int i = 0; i < rectangles.length; i++) {
            try {
                Assertions.assertEquals(testHeights[i], rectangles[i].getHeight());
            }
            catch (AssertionError a) {
                System.out.println("Height "+fail+i);
            }
        }
    }

    @Test
    void setHeight() {
        rectangles[0].setHeight(4.3);
        Assertions.assertEquals(4.3, rectangles[0].getHeight());
        rectangles[0].setHeight(-12);
        Assertions.assertEquals(12.0, rectangles[0].getHeight());
        rectangles[0].setHeight(-0);
        Assertions.assertEquals(0.0, rectangles[0].getHeight());
    }

    @Test
    void getWidth() {
        for (int i = 0; i < rectangles.length; i++) {
            try {
                Assertions.assertEquals(testWidths[i], rectangles[i].getWidth());
            }
            catch (AssertionError a) {
                System.out.println("Width "+fail+i);
            }
        }
    }

    @Test
    void setWidth() {
        rectangles[0].setHeight(1215641.1215512131);
        Assertions.assertEquals(1215641.1215512131, rectangles[0].getHeight());
        rectangles[0].setHeight(-12.3);
        Assertions.assertEquals(12.3, rectangles[0].getHeight());
        rectangles[0].setHeight(0.0000);
        Assertions.assertEquals(0.0, rectangles[0].getHeight());
    }

    @Test
    void calculateArea() {
        for (int i = 0; i < rectangles.length; i++) {
            try {
                Assertions.assertFalse(
                        TestHelpers.equalsWithPrecision(
                                String.valueOf(rectangles[i].calculateArea()),
                                String.valueOf(testArea[i]), 2) < 2);
            }
            catch (AssertionError a) {
                System.out.println("Area "+fail+i);
            }
        }
    }

    @Test
    void calculateCircumference() {
        for (int i = 0; i < rectangles.length; i++) {
            try {
                Assertions.assertFalse(
                        TestHelpers.equalsWithPrecision(
                                String.valueOf(rectangles[i].calculateCircumference()),
                                String.valueOf(testCirc[i]), 2) < 2);
            }
            catch (AssertionError a) {
                System.out.println("Circumference "+fail+i);
            }
        }
    }
}