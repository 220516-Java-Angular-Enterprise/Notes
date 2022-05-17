package com.Revature.UI;

public class ComparatorArea {

    public boolean isLessThan(Rectangle a, Rectangle b){
        if (a.GetArea() < b.GetArea())
            return true;
        return false;
    }
}
