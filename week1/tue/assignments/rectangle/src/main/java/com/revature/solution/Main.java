package com.revature.solution;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;


public class Main {
    public static Rectangle findMax(List<Rectangle> l, Comparator c) {
        Rectangle out = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            out = c.isLessThan(out, l.get(i)) ? l.get(i) : out;
        }
        return out;
    }

    public static void main(String[] args) {
        Random seeder = new Random();
        List<Rectangle> rectangles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rectangles.add(new Rectangle(UUID.randomUUID().toString().substring(0,5),
                    seeder.nextInt() % 50 + 50, seeder.nextInt() % 50 + 50));
            System.out.println(rectangles.get(i));
        }

        CompareArea comparatorA = new CompareArea();
        ComparePerimeter comparatorP = new ComparePerimeter();

        System.out.println("Largest Area: "+findMax(rectangles, comparatorA).getName());
        System.out.println("Largest Perimeter: "+findMax(rectangles, comparatorP).getName());
    }
}
