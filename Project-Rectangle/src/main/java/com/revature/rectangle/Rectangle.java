package com.revature.rectangle;

import java.util.List;

public class Rectangle {
    private String name;
    private int length;
    private int width;

public Rectangle( String name, int length, int width) {
    this.name=name;
    this.length= length;
    this.width=width;
}

    public Rectangle() {

    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getLength () {
        return length;
    }

    public void setLength ( int length){
        this.length = length;
    }

    public int getWidth () {
        return width;
    }

    public void setWidth ( int width){
        this.width = width;
    }


public int getArea () {
    return (length * width);
}

public int getPerimeter(){
    return(length +width)*2;
}
public Rectangle findMaxArea( List<Rectangle> rectangles){
    Rectangle rectangle = new Rectangle();
    Area com = new Area();
    for (Rectangle rec: rectangles){
        if(com.isLessThanArea(rectangle,rec) )rectangle = rec;
    }
    return rectangle;
}
public Rectangle findMaxPerimeter(List<Rectangle> rectangles){
    Rectangle rectangle =new Rectangle();
    Perimeter com= new Perimeter();

    for (Rectangle rec:rectangles) {
        if (com.isLessThanPerimeter(rectangle, rec)) {
            rectangle = rec;
        }

    }
   return rectangle;
}
    @Override
    public String toString() {
        return "Rectangle{"+ "name"+ name+ "length ="+ "width=" + "areas =" +getArea()+ "perimeter ="+ getPerimeter()+ '}';}

    }
