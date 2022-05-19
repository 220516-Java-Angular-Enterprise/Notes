package week1.wed.assignments.abstraction.src.test.java1;

import org.junit.jupiter.api.Test;
import week1.wed.assignments.abstraction.src.main.java1.com.revature.halAbs.Triangle;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle(12,23);

    @Test
    void getBase() {

        assertEquals(23,triangle.getBase());
    }

    @Test
    void getHeight() {
        assertEquals(12, triangle.getHeight());
    }

    @Test
    void setBase() {
        assertEquals(23,triangle.getBase());
    }

    @Test
    void setHeight() {

        assertEquals(12, triangle.getHeight());
    }

    @Test
    void calculateArea() {
        //assertEquals(128, triangle.calculateArea());

    }

    @Test
    void calculateCircumference() {
        //assertEquals(69, triangle.calculateCircumference());
    }
}