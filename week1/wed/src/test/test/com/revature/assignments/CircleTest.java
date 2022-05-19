package test.com.revature.assignments;
import com.revature.abstraction.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1 = new Circle(4);
    Circle c2 = new Circle(5);
    Circle c3 = new Circle(6);

    @Test
    void getRadius() {

    }


    @Test
    void calculateArea() {
        assertEquals(50.33, 50.33);

    }

    @Test
    void calculateCircumference() {
        assertEquals(25.17, c1.getRadius());
    }

}