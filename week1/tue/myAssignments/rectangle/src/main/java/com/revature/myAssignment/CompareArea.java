package com.revature.myAssignment;


public class CompareArea {

    public boolean isLessThan(Rectangle a, Rectangle b) {
        if (a.getArea() < b.getArea()) return true;
        return false;
    }
}
