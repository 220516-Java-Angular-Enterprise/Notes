package com.revature.rectangle_hal;

public class Rectangle {
    public String name;
    public int length;
    public int width;

   // constructors//
    public Rectangle(int length, int width) {
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
    public int getareas(){return length*width;}

    public int getperm(){return (length*2)+(width*2);}


    }






