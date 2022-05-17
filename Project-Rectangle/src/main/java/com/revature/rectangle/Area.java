package com.revature.rectangle;

public class Area {
    public boolean isLessThanArea(Rectangle a, Rectangle b){
        if (a.getArea()< b.getArea()){
            return true;
        }
        return false;
    }
}
