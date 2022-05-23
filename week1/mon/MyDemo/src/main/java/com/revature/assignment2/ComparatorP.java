package com.revature.assignment2;

public class ComparatorP {

    public boolean isLessThanPerimeter(Rectangle a, Rectangle b){

        if (a.getPerimeter() < b.getPerimeter())
            return true;
        else{
            return false;
        }
    }

}

