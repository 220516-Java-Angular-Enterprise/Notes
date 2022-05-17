package com.revature.rectang;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class UI {
    public static void main(String[] args){
List<Rectangle> testList = new LinkedList<>();
        Rectangle a = new Rectangle("Andrew", 20, 10);
        Rectangle b = new Rectangle("Bee", 20, 15);
        Comparation comparator = new Comparation();
       // rectangleList.add(a);
        //rectangleList.add(b);

        System.out.println("Rectangle A is: " + a.getArea());
        System.out.println("Rectangle B is: " + b.getArea());
        System.out.println("Rectangle A is >= Rectangle B: " + comparator.isLessThan(a,b));

        System.out.println("Rectangle A is: " + a.getPerimeter());
        System.out.println("Rectangle B is: " + b.getPerimeter());
        System.out.println("Rectangle perimeter A is >= Rectangle perimeter B: " + comparator.perimIsLessThan(a,b));


        FindMax test = new FindMax();
        test.create10Rect(testList);
        System.out.println(testList);

        System.out.println(test.findMaximum(testList));





    }
}
