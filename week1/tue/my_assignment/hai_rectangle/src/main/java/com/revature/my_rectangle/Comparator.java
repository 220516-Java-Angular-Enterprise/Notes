package com.revature.my_rectangle;

public class Comparator {

    public boolean isLessThanA(Rectangle a, Rectangle b){
        if(a.getArea() < b.getArea()){
            return true;
        } else {
            return false;
        }
    }

    public boolean isLessThanP(Rectangle a, Rectangle b){
        if (a.getPerimeter()< b.getPerimeter()) {
            return true;
        } else {
            return false;
        }
    }



}
