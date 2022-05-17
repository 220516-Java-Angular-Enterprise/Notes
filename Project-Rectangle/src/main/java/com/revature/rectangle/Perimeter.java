package com.revature.rectangle;

public class Perimeter {
    public boolean isLessThanPerimeter(Rectangle a,Rectangle b){
        if (a.getPerimeter()<b.getPerimeter()){
            return true;
        }
        return false;
    }
}
