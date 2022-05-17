package main.java.com.revature.Rectangle;

public class CompareArea {
    public boolean isLessThan(Rectangle recA, Rectangle recB){
        //compare areas of rectangles a and b
        if (recA.getArea() < recB.getArea()){
            return true;
            //else is not strictly necessary, but I find it more readable
        } else {
            return false;
        }
    }
}
