package com.Revature.UI;

public class Comparator {
    public Boolean isLessThan(Rectangle r, Rectangle r1){
        return r.getArea() < r1.getArea();
    }
    public Boolean isLessThanPerimeter(Rectangle r, Rectangle r1){
             return r.getPerimeter() < r1.getPerimeter();
       }

    }

