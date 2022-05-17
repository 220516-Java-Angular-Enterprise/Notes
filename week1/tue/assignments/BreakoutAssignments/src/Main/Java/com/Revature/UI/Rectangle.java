package com.Revature.UI;

import java.util.*;

public class Rectangle {

    private String name;
    private int length;
    private int width;


    public Rectangle(){

    }


    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
      return length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return (2 * this.length) + (2 * this.width);

    }

    @Override
    public String toString() {
        return "Rectangle "+ this.name +
                " is " + this.length + " units of length and has "
                 + this.width + " units of width.";
    }
    public Rectangle findAreaMax(ArrayList<Rectangle> list){
        Comparator a1 = new Comparator();
        Rectangle max = new Rectangle();

        if(!list.isEmpty()){
            for(Rectangle rectangle: list){
                if(a1.isLessThan(max, rectangle)){
                    max = rectangle;
                }
            }
        }
        return max;
    }

    public Rectangle findPerimeterMax(ArrayList<Rectangle> list){
        Comparator p1 = new Comparator();
        Rectangle max1 = new Rectangle();

        if(!list.isEmpty()){
            for(Rectangle rectangle: list){
                if(p1.isLessThan(max1, rectangle)){
                    max1 = rectangle;
                }
            }
        }
        return max1;
    }

}
