package com.revature.rectangle;

import java.util.ArrayList;

public class EricRectangle {

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

    public EricRectangle(){
        this.name = "";
        this.length = 0;
        this.width = 0;
    }

    public EricRectangle(String name, int length, int width){
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

    public EricRectangle findMaxArea(ArrayList<EricRectangle>  rectangles){
        EricCompare comp = new EricCompare();
        EricRectangle tempRect =  new EricRectangle("rect",Integer.MIN_VALUE,Integer.MIN_VALUE);

        for (EricRectangle rectangle : rectangles) {
            if (comp.areaIsLessThan(tempRect, rectangle)) {
                tempRect = rectangle;
            }
        }
        return tempRect;
    }

    public EricRectangle findMaxPerimeter(ArrayList<EricRectangle> rectangles){
        EricCompare comp = new EricCompare();
        EricRectangle tempRect =  new EricRectangle("rect",Integer.MIN_VALUE,Integer.MIN_VALUE);



        for(int i=1; i<rectangles.size();i++){

            if(comp.perimeterIsLessThan(tempRect, rectangles.get(i))){
                tempRect = rectangles.get(i);
            }
        }
        return tempRect;
    }


}


