package com.revature.rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UI {
    public static Rec main(String[] args) {

        List<Rec> recList = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
//            bound makes it start at 0 so no neg nums
            Rec rectangle = new Rec("rec" + (i + 1), r.nextInt(100), r.nextInt(100));
            recList.add(rectangle);
        }
        for (Rec out : recList) {
            System.out.println("Name: " + out.getName() + " Length: " + out.getLength() + " Width: " + out.getWidth());
        }

        public Rec findMaxArea() {
            Rec rectangle = new Rec();
            Area area = new Area();

            for(Rec rec : recList) {
                if(area.isLessThan(rectangle, rec)) rectangle = rec;
            }
            return rectangle;
        }

        System.out.println(new Rec().findMaxArea());
        System.out.println(new Rec().findMaxPerimeter());
    }

}