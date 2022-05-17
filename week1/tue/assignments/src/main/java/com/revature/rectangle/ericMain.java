package com.revature.rectangle;

import java.util.ArrayList;
import java.util.Random;

public class ericMain {

    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<ericRectangle> rectangleList = new ArrayList<>();
        for(int i=0; i<10; i++) {
            rectangleList.add(new ericRectangle("rec" + String.valueOf(i), rand.nextInt(100), rand.nextInt(100)));
            System.out.println(rectangleList.get(i));
        }

        ericRectangle bigBoi = new ericRectangle();
        bigBoi = bigBoi.findMaxArea(rectangleList);

        System.out.println(bigBoi);

        bigBoi = bigBoi.findMaxPerimeter(rectangleList);

        System.out.println(bigBoi);

    }




}


