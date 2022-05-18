package com.revature.rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        List<Rectangle> rectangles = new ArrayList<>();

       int i = 0;
       while (i < 5) {
           try {
               System.out.print("Enter in rectangle name: ");
               Rectangle rect = new Rectangle(scan.nextLine(), (rand.nextInt(1000 + 1000) - 1000), (rand.nextInt(1000 + 1000) - 1000));
               rectangles.add(rect);

               i++;
           } catch (IllegalArgumentException e) {
               e.printStackTrace();
               System.out.println("\n");
           }
       }

       System.out.println();

       for (Rectangle rect : rectangles) {
           System.out.println(rect);
       }

       System.out.println("\nMax area: " + new Rectangle().findMaxArea(rectangles, new Comparator()));
       System.out.println("\nMax perimeter: " + new Rectangle().findMaxPerimeter(rectangles, new Comparator()));
    }
}
