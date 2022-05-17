package com.revature.rectangle;

public class EricCompare {

    public boolean areaIsLessThan(EricRectangle a, EricRectangle b){
        return a.getArea() < b.getArea();
    }

    public boolean perimeterIsLessThan(EricRectangle a, EricRectangle b){
        return a.getPerimeter() < b.getPerimeter();
    }
}
