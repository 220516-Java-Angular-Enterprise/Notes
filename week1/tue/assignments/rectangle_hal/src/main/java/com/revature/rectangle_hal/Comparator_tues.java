package com.revature.rectangle_hal;

public class Comparator_tues {



    public boolean isLessThanArea(Rectangle_tues r1, Rectangle_tues r2) {
        if (r1.getArea() < r2.getArea()) return true;

        return false;
    }

    public boolean isLessThanPerimeter(Rectangle_tues r1, Rectangle_tues r2) {
        if (r1.getPerimeter() < r2.getPerimeter()) return true;

        return false;
    }
}