package com.revature.assignments;

public class ComparatorPerimeter {
    public boolean isLessThan(Rectangle a, Rectangle b){
        //todo same as area
        if(a.getPerimeter() < b.getPerimeter()){
            return true;
        }
        return false;
    }
}
