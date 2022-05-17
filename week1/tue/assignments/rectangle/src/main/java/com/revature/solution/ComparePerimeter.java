package com.revature.solution;

public class ComparePerimeter extends Comparator {
    @Override
    public boolean isLessThan(Rectangle a, Rectangle b) {
        return a.perimeter() < b.perimeter();
    }
}
