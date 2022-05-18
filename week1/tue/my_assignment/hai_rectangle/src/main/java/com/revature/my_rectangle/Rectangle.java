package com.revature.my_rectangle;

public class Rectangle {
   private String name;
    private int length;
    private int width;

//    Constructors
    public Rectangle(String name, int length, int width){
        this.name = name;
        this.length = length;
        this.width = width;

    }

    public Rectangle(){};

//    ToString
    @Override
    public String toString(){
        return "name: " + name + '\'' +
                "length: " + length + '\'' +
                "width: " + width + '\'' +
                '\n';
    }

//    AREA & PERIMETER METHODS

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return 2*(width + length);
    }

//    GETTERS
    public String getName(){
        return name;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

//    SETTER
    public void setName(String name){
        this.name = name;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }
}
