package com.revature.rectangle_hal;

import java.util.Comparator;
import java.util.List;

public class Rectangle {
    public String name;
    public int length;
    public int width;

   // constructors//
    public Rectangle(String s, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;

    }
// getters//
    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

//setters//
    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
//get area and perimeter//
    public int getAreas(){return length*width;}

    public int getPerm(){return (2*(length+width));}

   // *public Rectangle findMaxArea(List<Rectangle>rectangles, Comparator com){
        //Rectangle rectangle = new Rectangle();

        //for (Rectangle rec : rectangles){
            //if( com.isLessThanAreahrectangle, rec)) rectangle = rec;
        //}
        //return rectangle;

    //}

    public Rectangle findMaxPerimeter(List<Rectangle>rectangles, Comparator com) {
        Rectangle rectangle = new Rectangle();

        for (Rectangle rec : rectangles) {
            if (com.isLessThanPerimeter(rectangle, rec)) rectangle = rec;
        }
        return rectangle;
    }


    public String toString(){
        return "Rectangle {"+"name =" name + " length= " + length+ " width= "+width +" area= "+ getAreas()+ " perimeter= "+ getPerm()+'}';
    }
    }






