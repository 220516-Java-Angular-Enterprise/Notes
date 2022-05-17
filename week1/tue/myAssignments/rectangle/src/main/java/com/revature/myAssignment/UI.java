package com.revature.myAssignment;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class UI {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>(10);


        // User-input rectangle sizes:
        //Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        /*
        for (int i = 1; i < 11; i++) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            System.out.println("Rectangle " + i + " name: ");
            String setName = myObj.nextLine();
            System.out.println("Side 1: ");
            int setSide1 = myObj.nextInt();
            System.out.println("Side 2: ");
            int setSide2 = myObj.nextInt();

            rectangles.add(new Rectangle(setName, setSide1, setSide2));
        } */

        rectangles.add( new Rectangle("First", 5, 10) );
        rectangles.add( new Rectangle("Second", 65, 67) );
        rectangles.add( new Rectangle("Third", 1, 163) );
        rectangles.add( new Rectangle("Fourth", 65, 87) );
        rectangles.add( new Rectangle("Fifth", 3, 65) );
        rectangles.add( new Rectangle("Sixth", 67, 21) );
        rectangles.add( new Rectangle("Seventh", 58, 32 ) );
        rectangles.add( new Rectangle("Eighth", 94, 68) );
        rectangles.add( new Rectangle("Ninth", 45, 35) );
        rectangles.add( new Rectangle("Tenth", 34, 16) );

        for (Rectangle a : rectangles) {
            System.out.println(a.getName() + ", " + a.getLength() + ", " + a.getWidth() + ", area: " + a.getArea() + ", perimeter: " + a.getPer());
        }

        Rectangle maxArea = findMax(rectangles, true);
        System.out.println("Max Area: " + maxArea.getName() + " " + maxArea.getLength() + " " + maxArea.getWidth());

        Rectangle maxPer = findMax(rectangles, false);
        System.out.println("Max Per: " + maxPer.getName() + " " + maxPer.getLength() + " " + maxPer.getWidth());

    }

    public static Rectangle findMax(List<Rectangle> rectangles, boolean findArea) {
        Rectangle max = new Rectangle();
        CompareArea area = new CompareArea();
        ComparePer per = new ComparePer();

        if (findArea == true) {
            for (Rectangle a : rectangles) {
                if (area.isLessThan(max, a)) max = a;
            }
        }
        else {
            for (Rectangle a : rectangles) {
                if (per.isLessThan(max, a)) max = a;
            }
        }
        return max;

    }
}
