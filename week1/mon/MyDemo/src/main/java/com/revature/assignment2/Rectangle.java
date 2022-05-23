package com.revature.assignment2;
import java.util.List;
public class Rectangle {
    private String name;
    private int length;
    private int width;
    public Rectangle(){}
    public Rectangle(String name, int length, int width){ // constructor
        this.name= name;
        this.length=length;
        this.width= width;

    };
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



    public int getArea(){return length*width;}

    public int getPerimeter(){
        return 2*(width+length);
    };

    public Rectangle findMaxArea(List<Rectangle> rectangles, Comparator compare) {
        Rectangle rectangle = new Rectangle();

        for (Rectangle rec : rectangles) {
            if (compare.isLessThanArea(rectangle, rec)) rectangle = rec;
        }

        return rectangle;
    }

    public Rectangle findMaxPerimeter(List<Rectangle> rectangles, ComparatorP compare) {
        Rectangle rectangle = new Rectangle();

        for (Rectangle rec : rectangles) {
            if (compare.isLessThanPerimeter(rectangle, rec)) rectangle = rec;
        }

        return rectangle;
    }

    @Override
    public String toString() {
        return "Rectangle {" + "name= " + name + " length= " + length + " width= " + width + " area= " + getArea() + " perimeter= " + getPerimeter() + '}';
    }
}

