package com.revature.assignments;

import java.util.List;

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

    public int getArea(){
        return length*width;
    }

    public int getPerimeter(){
        return (length+width)*2;
    }

    public Rectangle findMaxArea(List<Rectangle> recList){
        ComparatorArea compA = new ComparatorArea();
        Rectangle rec = new Rectangle();
        for(Rectangle out: recList){
            if(rec.getArea() < out.getArea()){ rec = out;}
        }
        return rec;
    }

    public Rectangle findMaxPerimeter(List<Rectangle> recList){
        ComparatorPerimeter compP= new ComparatorPerimeter();
        Rectangle rec = new Rectangle();
        for(Rectangle out: recList){
            if(rec.getPerimeter() < out.getPerimeter()){ rec = out;}
        }
        return rec;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
