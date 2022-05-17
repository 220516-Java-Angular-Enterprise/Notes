package com.revature.myAssignment;

import org.w3c.dom.css.Rect;

public class Rectangle {
    private String Name;
    private int Length;
    private int Width;

    public Rectangle() {}
    public Rectangle(String name, int length, int width) {
        Name = name;
        Length = length;
        Width = width;
    }


    public int getArea() {
        return Length * Width;
    }

    public int getPer() {
        return (2 * Length) + (2 * Width);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }
}
