package com.revature.solution;

public class CompareArea extends Comparator {
    @Override
    public boolean isLessThan(Rectangle a, Rectangle b) {
        return a.area() < b.area();
    }
}
