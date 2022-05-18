package com.revature.rectangle;

import java.util.ArrayList;
import java.util.List;

public class Rec {

    private  String name;
    private int length;
    private int width;

    public Rec() {

    }

    public Rec(String name, int length, int width) {
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

    public int area() {
        return length * width;
    }

    public int perimeter() {

        return 2 * ( length + width);
    }

    public Rec findMaxPerimeter() {
        Rec rectangle = new Rec();
        Perimeter peri = new Perimeter();
        List<Rec> recList = new ArrayList<>();

        for(Rec rec : recList) {
            if(peri.isLessThan(rectangle, rec)) rectangle = rec;
        }
        return rectangle;
    }

    public Rec findMaxArea() {
        Rec rectangle = new Rec();
        Area area = new Area();
        List<Rec> recList = new ArrayList<>();

        for(Rec rec : recList) {
            if(area.isLessThan(rectangle, rec)) rectangle = rec;
        }
        return rectangle;
    }

    @Override
    public String toString() {
        return "Rec{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}