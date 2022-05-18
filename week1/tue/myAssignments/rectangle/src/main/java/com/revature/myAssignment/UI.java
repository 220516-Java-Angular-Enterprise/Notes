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

        for (int i = 1; i < 3; i++) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            System.out.println("Rectangle " + i + " name: ");
            String setName = myObj.nextLine();
            System.out.println("Side 1: ");
            int setSide1 = myObj.nextInt();
            System.out.println("Side 2: ");
            int setSide2 = myObj.nextInt();

            rectangles.add(new Rectangle(setName, setSide1, setSide2));
        }

        /*
        // Hard Coded Rectangles added to the list

        rectangles.add( new Rectangle("First", 5, 10) );
        rectangles.add( new Rectangle("Second", 65, 67) );
        rectangles.add( new Rectangle("Third", 1, 163) );
        rectangles.add( new Rectangle("Fourth", 65, 87) );
        rectangles.add( new Rectangle("Fifth", 3, 65) );
        */

        // Output all the rectangles as well as the area and the perimeter
        for (Rectangle a : rectangles) {
            System.out.println(a);
        }

        Rectangle maxArea = new Rectangle();
        Rectangle maxPer = new Rectangle();

        for (Rectangle a : rectangles) maxArea = maxArea.findMaxArea(a);
        for (Rectangle a : rectangles) maxPer = maxPer.findMaxPer(a);
        System.out.println("Rectangle w/ Max Area: ");
        System.out.println(maxArea);
        System.out.println("Rectangle w/ Max Perimeter: ");
        System.out.println(maxPer);

    }
}
