package com.revature.assignments;

public class Comparator {
    public boolean isLessThan(Rectangle a, Rectangle b){
        //Todo What to do if they are equal (ie should it be true or false) and what to return if a is < b
        if(a.getArea() < b.getArea()){
            return true;
        }
        return false;
    }
}
