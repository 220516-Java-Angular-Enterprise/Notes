package com.revature.rectangle;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creating random object for random integers
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        ArrayList<Rectangle> rectList = new ArrayList<>();

        for(int i=0; i<3; i++){
            //instantiating new objects (3 new rectangles)
            System.out.print("Choose rectangle name: ");
            rectList.add(new Rectangle(in.nextLine(), random.nextInt(100), random.nextInt(100)));
        }

        //displaying each rectangle using toString() implicitly
        for(Rectangle r : rectList){
            System.out.println(r);
        }

        //new rectangle to find the max area
        Rectangle highestArea = new Rectangle().findAreaMax(rectList);
        //new rectangle to find the max perimeter
        Rectangle highestPerimeter = new Rectangle().findPerimeterMax(rectList);

        //displaying using toString()
        System.out.println("\nHighest Area: " +highestArea);
        System.out.println("Highest Perimeter: "+highestPerimeter);
    }


}
