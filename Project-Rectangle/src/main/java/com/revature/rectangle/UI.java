package com.revature.rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class UI {
    public static void main(String args[]){
        List <Rectangle> rectList = new ArrayList<>();
        Random r= new Random();
        for(int i=0; i <10; i++){
            System.out.print("Enter in rectangle");
            Rectangle rectangle=new Rectangle("Recs"+(i+1),r.nextInt(50),r.nextInt(100));
            rectList.add(rectangle);
        }
        System.out.println();

        for (Rectangle out:rectList){
            System.out.println(out);
        }
        List<Rectangle> Rectangle;
        System.out.println("\nMax Area: " +new Rectangle().findMaxArea(rectList ));
        System.out.println("\nMax Perimeter: "+new Rectangle().findMaxPerimeter(rectList));
    }
}
