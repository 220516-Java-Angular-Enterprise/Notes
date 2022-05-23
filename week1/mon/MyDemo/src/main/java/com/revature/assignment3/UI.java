package com.revature.assignment3;

import java.text.DecimalFormat;

public class UI {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Circle obj = new Circle();
        obj.setRadius(5);
        obj.calculateArea();
        obj.calculateCircumference();
        System.out.println("Area of Circle is: "+df.format(obj.calculateArea())+"\n"+"Circumference of Circle is: "+df.format(obj.calculateCircumference()));


        rectangle obj1=new rectangle();
        obj1.setHeight(10);
        obj1.setWidth(4);
        obj1.calculateArea();
        obj1.calculateCircumference();
        System.out.println("\n"+"Area of Rectangle is: "+df.format(obj1.calculateArea())+"\n"+"Circumference of Rectangle is: "+df.format(obj1.calculateCircumference()));

        Triangle obj2=new Triangle();
        obj2.setBase(7);
        obj2.setHeight(3);
        obj2.calculateArea();
        obj2.calculateCircumference();
        System.out.println("\n"+"Area of Triangle is: "+df.format(obj2.calculateArea())+"\n"+"Circumference of Triangle is: "+df.format(obj2.calculateCircumference()));



    }
}

