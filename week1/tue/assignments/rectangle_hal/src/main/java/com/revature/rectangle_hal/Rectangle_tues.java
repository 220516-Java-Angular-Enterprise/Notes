package com.revature.rectangle_hal;

import java.util.List;

public class Rectangle_tues {
    private String name;
    private int length;
    private int width;

    public Rectangle_tues() {

    }

    public Rectangle_tues(String name, int length, int width) {
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

    public Rectangle_tues findMaxArea(List<Rectangle_tues> rectangles, Comparator_tues com) {
        Rectangle_tues rectangle = new Rectangle_tues();

        for (Rectangle_tues rec : rectangles) {
            if (com.isLessThanArea(rectangle, rec)) rectangle = rec;
        }

        return rectangle;
    }

    public Rectangle_tues findMaxPerimeter(List<Rectangle_tues> rectangles, Comparator_tues com) {
        Rectangle_tues rectangle = new Rectangle_tues();

        for (Rectangle_tues rec : rectangles) {
            if (com.isLessThanPerimeter(rectangle, rec)) rectangle = rec;
        }

        return rectangle;
    }

    @Override
    public String toString() {
        return "Rectangle {" + "name= " + name + " length= " + length + " width= " + width + " area= " + getArea() + " perimeter= " + getPerimeter() + '}';
    }
}
