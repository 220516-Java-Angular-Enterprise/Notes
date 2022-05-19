package week1.tue.assignments.rectangle_hal.src.main.com.revature.rectangle_tues;

public class ComparatorTues {
    public boolean isLessThanArea(RectangleTues r1, RectangleTues r2) {
        if (r1.getArea() < r2.getArea()) return true;

        return false;
    }

    public boolean isLessThanPerimeter(RectangleTues r1, RectangleTues r2) {
        if (r1.getPerimeter() < r2.getPerimeter()) return true;

        return false;
    }
}
