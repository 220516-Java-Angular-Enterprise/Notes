package com.Revature.UI;

public class ComparatorPerimeter {
    public boolean isLessThan(Rectangle a, Rectangle b){
        if (a.GetPerimeter() < b.GetPerimeter())
            return true;
        return false;

    }
}
