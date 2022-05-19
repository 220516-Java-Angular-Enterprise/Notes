package com.revature.rectangle_hal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UI_tues {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        List<Rectangle_tues> rectangles = new ArrayList<>();
        int i = 0;
        while (i < 5) {
            try {
                System.out.print("Enter in rectangle name: ");
                Rectangle_tues rect = new Rectangle_tues(scan.nextLine(), (rand.nextInt(1000 + 1000) - 1000), (rand.nextInt(1000 + 1000) - 1000));
                rectangles.add(rect);

                i++;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("\n");
            }
        }

        System.out.println();

        for (Rectangle_tues rect : rectangles) {
            System.out.println(rect);
        }

        System.out.println("\nMax area: " + new Rectangle_tues().findMaxArea(rectangles, new Comparator_tues()));
        System.out.println("\nMax perimeter: " + new Rectangle_tues().findMaxPerimeter(rectangles, new Comparator_tues()));
    }
}
