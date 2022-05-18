package test.com.revature.assignments;

import com.revature.assignments.Comparator;
import com.revature.assignments.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComparatorTest {
    Comparator comparator = new Comparator();

    @Test
    void isLessThanArea() {
        Rectangle rec1 = new Rectangle("1", 50, 40);
        Rectangle rec2 = new Rectangle("2", 51,52);
        Rectangle rec3 = new Rectangle("3", 2,2);

        assertTrue(comparator.isLessThanArea(rec1, rec2));
        assertTrue(comparator.isLessThanArea(rec3, rec2));

        assertFalse(comparator.isLessThanArea(rec2, rec3));
        assertFalse(comparator.isLessThanArea(rec1, rec3));
    }

    @Test
    void isLessThanPerim() {

        Rectangle rec1 = new Rectangle("1", 500, 500);
        Rectangle rec2 = new Rectangle("2", 100, 100);
        Rectangle rec3 = new Rectangle("3", 600, 600);

        assertTrue(comparator.isLessThanPerim(rec2, rec1));
        assertTrue(comparator.isLessThanPerim(rec1, rec3));

        assertFalse(comparator.isLessThanPerim(rec1, rec2));
        assertFalse(comparator.isLessThanPerim(rec3, rec2));
    }
}
