package com.Revature.UI;

public class Rectangle {
    String name;
    int length, width;

    public Rectangle(String name, int length, int width){
        this.name = name;
        this.length = length;
        this.width = width;
    }



    //<editor-fold desc="Get/Set">
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }


    //</editor-fold>



    public int GetArea(){
        return length * width;
    }
    public int GetPerimeter(){
        return (length * 2) + (width * 2);
    }

}
