package week1.wed.assignments.abstraction.src.test.java1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week1.wed.assignments.abstraction.src.main.java1.com.revature.halAbs.Rectangled;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangled rectangle = new Rectangled(3, 2);

    @Test
    void getWidth() {
        assertEquals(2, rectangle.getWidth());
    }

    @Test
    void getHeight() {
        assertEquals(3, rectangle.getHeight());
    }

    @Test
    void setHeight() {
        assertEquals(3, rectangle.getHeight());
    }

    @Test
    void setWidth() {
        assertEquals(2, rectangle.getWidth());
    }

    @Test
    void calculateArea() {
        //* assertEquals(6, triangle.calculateArea());
    }


    @Test
    void calculateCircumference() {
        //* assertEquals(12, triangle.calculateCircumference());
    }
}