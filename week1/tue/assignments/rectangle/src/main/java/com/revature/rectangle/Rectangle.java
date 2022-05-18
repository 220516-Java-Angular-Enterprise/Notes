package com.revature.rectangle;
import java.util.*;
public class Rectangle extends Object{
    private String name;
    private int length, width;

    public Rectangle(){

    }

    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public Rectangle findAreaMax(ArrayList<Rectangle> rectangles){
        //creating area object to
        Comparator area = new Comparator();
        //creating temporary object
        Rectangle tempArea = new Rectangle();

        for(Rectangle r : rectangles){
            if(area.isLessThanArea(tempArea, r))
                tempArea = r;
        }

        return tempArea;
    }

    /*public Rectangle findPerimeterMax(Rectangle[] rectangles){
        Perimeter perimeter = new Perimeter();
        Rectangle tempPerimeter = new Rectangle(" ",0,0);

        for(int i =0; i<rectangles.length; i++){
            if(perimeter.isLessThan(tempPerimeter, rectangles[i]))
                tempPerimeter = rectangles[i];
        }
        return tempPerimeter;
    }*/

    public int getArea(){
        return length*width;
    }

    public int getPerimeter(){
        return (2*length)+(2*width);
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
}
