package com.revature.rectangle;

import java.util.List;

public class Rectangle {
    private String name;
    private int length;
    private int width;

    public Rectangle() {

    }

    public Rectangle(String name, int length, int width) {
        this.name = name;

        if (length < 0) throw new IllegalArgumentException("Length cannot be negative: " + length);
        this.length = length;

        if (width < 0) throw new IllegalArgumentException("Width cannot be negative: " + width);
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
        if (length < 0) throw new IllegalArgumentException("Length cannot be negative: " + length);
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) throw new IllegalArgumentException("Width cannot be negative: " + width);
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public Rectangle findMaxArea(List<Rectangle> rectangles, Comparator com) {
        Rectangle rectangle = new Rectangle();

        for (Rectangle rec : rectangles) {
            if (com.isLessThanArea(rectangle, rec)) rectangle = rec;
        }

        return rectangle;
    }

    public Rectangle findMaxPerimeter(List<Rectangle> rectangles, Comparator com) {
        Rectangle rectangle = new Rectangle();

        for (Rectangle rec : rectangles) {
            if (com.isLessThanPerimeter(rectangle, rec)) rectangle = rec;
        }

        return rectangle;
    }

    @Override
    public String toString() {
        return "Rectangle {" + "name= " + name + " length= " + length + " width= " + width + " area= " + getArea() + " perimeter= " + getPerimeter() + '}';
    }
}
