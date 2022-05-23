package java.com.revature.shapesTest;

import org.junit.jupiter.api.Test;

import java.com.revature.shapes.Triangle;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
//TODO: select and justify better test cases
    Triangle[] triArr = {
            new Triangle(5, 10),
            new Triangle(1, 1),
            new Triangle(2, 2),
            new Triangle(1.5, 2.5),
            new Triangle(1, 100)
    };
    @Test
    void calculateArea() {
    assertEquals(25, triArr[0].calculateArea());
    assertEquals(0.5, triArr[1].calculateArea());
    assertEquals(2, triArr[2].calculateArea());
    assertEquals(1.875, triArr[3].calculateArea());
    assertEquals(50, triArr[4].calculateArea());
    }

    @Test
    void calculateCircumference() {
    }
}