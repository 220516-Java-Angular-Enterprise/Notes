package com.revature.rectangle;

import java.util.ArrayList;

public class ericRectangle {

    private String name;
    private int length;
    private int width;

    @Override
    public String toString() {
        return "Rectangle Name: " + name +
                ", Rectangle Length: " + length +
               ", Rectangle Width: " + width;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ericRectangle(){
        this.name = "";
        this.length = 0;
        this.width = 0;
    }

    public ericRectangle(String name, int length, int width){
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return (this.length*2) + (this.width*2);
    }

    public ericRectangle findMaxArea(ArrayList<ericRectangle>  rectangles){
        ericCompare comp = new ericCompare();
        ericRectangle tempRect =  new ericRectangle("rect",Integer.MIN_VALUE,Integer.MIN_VALUE);

        for(int i=0; i<rectangles.size();i++){
            if(comp.areaIsLessThan(tempRect, rectangles.get(i))){
                tempRect = rectangles.get(i);
            }
        }
        return tempRect;
    }

    public ericRectangle findMaxPerimeter(ArrayList<ericRectangle> rectangles){
        ericCompare comp = new ericCompare();
        ericRectangle tempRect =  new ericRectangle("rect",Integer.MIN_VALUE,Integer.MIN_VALUE);



        for(int i=1; i<rectangles.size();i++){

            if(comp.perimeterIsLessThan(tempRect, rectangles.get(i))){
                tempRect = rectangles.get(i);
            }
        }
        return tempRect;
    }


}


