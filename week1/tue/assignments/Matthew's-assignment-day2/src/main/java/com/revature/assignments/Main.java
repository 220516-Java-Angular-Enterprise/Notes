package com.revature.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String args[]){
        List<Rectangle> recList = new ArrayList<>();
        Random r = new Random();
        Rectangle rec = new Rectangle();
        for(int i = 0; i < 10; i++) {
            //todo create or ask for 10 random rectangles
            Rectangle rectangle = new Rectangle("Rectangle " + (i+1), r.nextInt(), r.nextInt(100));
            try {
                if (rectangle.getLength() < 0 || rectangle.getWidth() < 0){
                    throw new ExceptionNegativeSide();
                }

            }catch (ExceptionNegativeSide e){
                System.out.print(rectangle+ " ");
                System.out.println(e.getMessage());
                i--;
                continue;
            }
            recList.add(rectangle);
        }
        for (Rectangle out:recList) {
            System.out.println(out);
        }
        System.out.println("Rectangle with max Area = " + rec.findMaxArea(recList));
        System.out.println("Rectangle with max Perimeter = " + rec.findMaxPerimeter(recList));
    }

}
