package com.revature.assignments;
public class Comparator extends Rectangle {
    public boolean isLessThanArea(Rectangle a, Rectangle b) {
        return a.getArea() < b.getArea();
    }

    public boolean isLessThanPerim(Rectangle a, Rectangle b) {
        return a.getPerimeter() < b.getPerimeter();
    }

}


