package com.Revature.UI;

import java.util.*;

public class Main {


    public static void main(String[] args){
        List<Rectangle> rectangles = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Comparator a = new Comparator();
        Comparator p = new Comparator();
        Rectangle t = new Rectangle();

        Random num = new Random();



        for(int i=1; i<10; i++) {
            String n = input.next();
            rectangles.add(new Rectangle(n, num.nextInt(500), num.nextInt(500)));
        }
        for(Rectangle rectangle: rectangles){
            System.out.println(rectangle);
        }

        System.out.println(t.findAreaMax((ArrayList<Rectangle>) rectangles));
        System.out.println(t.findPerimeterMax((ArrayList<Rectangle>) rectangles));

    }
}
