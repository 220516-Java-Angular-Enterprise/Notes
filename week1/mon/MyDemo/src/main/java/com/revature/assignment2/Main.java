package com.revature.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        List <Rectangle> rectangles=new ArrayList<>();
        Random ram = new Random();
        Scanner scan= new Scanner(System.in);

        for(int i = 1; i<11; i++){
            System.out.println("Rectangle name: "+i);
            Rectangle rect=new Rectangle(scan.nextLine(), ram.nextInt(), ram.nextInt());
            //String setName=scan.nextLine();
           // System.out.println("Enter Width: ");
            //int setWidth=scan.nextInt();
            //System.out.println("Enter Length: ");
           // int setLength=scan.nextInt();
           // Rectangle rect= new Rectangle(setName, setWidth, setLength);
           // Rectangle rect=new Rectangle();
            //Rectangle rect =  new Rectangle(rect.setName(scan.nextLine()), rect.setWidth(scan.nextInt()), rect.setLength(scan.nextInt()));
            rectangles.add(rect);

    }     for(Rectangle rect:rectangles)
        System.out.println(rect);


           System.out.println("Max Area= "+ new Rectangle().findMaxArea(rectangles, new Comparator()));
          System.out.println("Max perimeter: " + new Rectangle().findMaxPerimeter(rectangles, new ComparatorP()));
}
}