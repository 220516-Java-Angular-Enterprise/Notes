package com.revature.assignments;
import java.util.List;

public class Rectangle {
    String name;
    int length;
    int width;

    public Rectangle() {};
    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return width*length;
    }

    public int getPerimeter() {
        return 2*(width + length);
    }

    public Rectangle findMaxArea(List<Rectangle> list, Comparator com) {
        Rectangle maxRec = new Rectangle();

        // rec gets assigned to maxRec over the iteration
        for (Rectangle rec : list) {
            if (com.isLessThanArea(maxRec, rec)) maxRec = rec;
            }
        return maxRec;
    }
    public Rectangle findMaxPerimeter(List<Rectangle> list, Comparator com) {
        Rectangle maxRec = new Rectangle();

        // rec gets assigned to maxRec over the iteration
        for (Rectangle rec : list) {
            if (com.isLessThanPerim(maxRec, rec)) maxRec = rec;
        }
        return maxRec;
    }

    @Override
    public String toString() {
        return "Rectangle {" + "name= " + name + " length= " + length + " width= " + width + " area= " + getArea() + " perimeter= " + getPerimeter() + '}';
    }
}

