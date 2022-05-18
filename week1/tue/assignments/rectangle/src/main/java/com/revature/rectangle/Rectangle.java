package com.revature.rectangle;
import java.util.*;
public class Rectangle extends Object{

    private String name;
    private int length, width;
    Comparator compare = new Comparator();
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
        //creating temporary object
        Rectangle tempArea = new Rectangle();


        for(Rectangle r : rectangles){
            if(compare.isLessThanArea(tempArea, r))
                tempArea = r;
        }

        return tempArea;
    }

    public Rectangle findPerimeterMax(List<Rectangle> rectangles){
        //creating a comparator object

        Rectangle tempPerimeter = new Rectangle();

        for(Rectangle r : rectangles){
            if(compare.isLessThanPerimeter(tempPerimeter, r))
                tempPerimeter = r;
        }
        return tempPerimeter;
    }

    public int getArea(){
        return length*width;
    }

    public int getPerimeter(){
        return (2*length)+(2*width);
    }






}
