package com.revature.assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UI {
    public static void main(String[] args) {
        List <Rectangle> reclist = new ArrayList<>();

        int i=0;
        for (i=0; i<=10; i++) {
            Random rand1 = new Random();
            Random rand2 = new Random();
            Rectangle newRec = new Rectangle("name " +i+"", rand1.nextInt(100),rand2.nextInt(100));

            reclist.add(newRec);

        }

        // printing out list elements
        for (Rectangle rec : reclist) {
            System.out.println(rec);
        }

        System.out.println("\nMax area: " + new Rectangle().findMaxArea(reclist, new Comparator()));
        System.out.println("\nMax Perimeter: " + new Rectangle().findMaxPerimeter(reclist, new Comparator()));
    }
}
