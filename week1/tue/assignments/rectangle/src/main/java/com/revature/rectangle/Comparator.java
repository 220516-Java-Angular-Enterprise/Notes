package com.revature.rectangle;

public class Comparator {
    public boolean isLessThanArea(Rectangle r1, Rectangle r2){
        //getting area from both rectangles to compare
        return r1.getArea() < r2.getArea();

    }
    public boolean isLessThanPerimeter(Rectangle r1, Rectangle r2){
        //getting perimeter from both rectangles to compare
        return r1.getPerimeter()<r2.getPerimeter();
    }
}
