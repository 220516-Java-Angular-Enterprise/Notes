package main.java.com.revature.Rectangle;

public class Comparator {

    public boolean areaIsLessThan(Rectangle recA, Rectangle recB){
        //compare areas of rectangles a and b
        if (recA.getArea() < recB.getArea()){
            return true;
            //else is not strictly necessary, but I find it more readable
        } else {
            return false;
        }
    }
    public boolean perimeterIsLessThan(Rectangle recA, Rectangle recB){
        //compare perimeters of rectangles a and b
        if (recA.getPerimeter() < recB.getPerimeter()){
            return true;
            //else is not strictly necessary, but I find it more readable
        } else {
            return false;
        }
    }
}

