package week1.wed.assignments.abstraction.src.test.java1;

import org.junit.jupiter.api.Test;
import week1.wed.assignments.abstraction.src.main.java1.com.revature.halAbs.Circle;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle = new Circle(4);
    @Test
    void getRadius() {
        assertEquals(4,circle.getRadius());
    }

    @Test
    void setRadius() {
        assertEquals(4, circle.getRadius());
    }

    @Test
    void calculateArea() {
        //assertEquals(42.2, circle.calculateArea());
    }

    @Test
    void calculateCircumference() {
        //assertEquals(32.12, circle.calculateCircumference);
    }
}