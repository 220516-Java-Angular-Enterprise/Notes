package com.revature.rectangle;

public class ericCompare {

    public boolean areaIsLessThan(ericRectangle a, ericRectangle b){
        return a.getArea() < b.getArea();
    }

    public boolean perimeterIsLessThan(ericRectangle a, ericRectangle b){
        return a.getPerimeter() < b.getPerimeter();
    }
}
