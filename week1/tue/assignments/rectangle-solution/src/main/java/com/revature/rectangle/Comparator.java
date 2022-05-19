package com.revature.rectangle;

public class Comparator {

    public boolean isLessThanArea(Rectangle r1, Rectangle r2) {
        if (r1.getArea() < r2.getArea()) return true;

        return false;
    }

    public boolean isLessThanPerimeter(Rectangle r1, Rectangle r2) {
        if (r1.getPerimeter() < r2.getPerimeter()) return true;

        return false;
    }
}
