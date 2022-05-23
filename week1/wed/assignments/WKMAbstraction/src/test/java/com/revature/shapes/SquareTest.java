package java.com.revature.shapesTest;

import org.junit.jupiter.api.Test;

import java.com.revature.shapes.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    Square[] sqArr = {
            new Square(5),
            new Square(1),
            new Square(2),
            new Square(1.5),
            new Square(100)
    };
    @Test
    void calculateArea() {
        assertEquals(25,sqArr[0].calculateArea());
        assertEquals(1,sqArr[1].calculateArea());
        assertEquals(4,sqArr[2].calculateArea());
        assertEquals(2.25,sqArr[3].calculateArea());
        assertEquals(10000,sqArr[4].calculateArea());
        }


    @Test
    void calculateCircumference() {
    }
}