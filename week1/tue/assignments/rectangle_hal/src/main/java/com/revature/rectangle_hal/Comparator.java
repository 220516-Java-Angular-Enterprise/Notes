package com.revature.rectangle_hal;

public class Comparator {

    public boolean isLessThanArea(Rectangle r1, Rectangle r2){
        if (r1.getAreas() < r2.getAreas()) return true;

        return false;
    }
    public boolean isLessThanPerimeter(Rectangle r1, Rectangle r2) {
        if (r1.getPerm() < r2.getPerm()) return true;

        return false;
    }

}