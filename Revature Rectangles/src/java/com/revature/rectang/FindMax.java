package com.revature.rectang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FindMax {
    Random rG = new Random();
    List<Rectangle> rectangleList = new ArrayList();




    public List<Rectangle> create10Rect(List<Rectangle> rectList){

        for(int i = 1; i < 11; i++){
            int length = rG.nextInt(20);
            int width = rG.nextInt(20);
            rectList.add(new Rectangle("A"+i,length,width));
        }

        return rectList;
    }



    public String findMaximum(List<Rectangle> a){
            Rectangle max = new Rectangle();
            for(int i = 0; i < a.size(); i++){
                if (max.getArea() < a.get(i).getArea()) {
                    max = a.get(i);
                }
            }
            return "The largest rectangle is: " + max + "with the area of: " + max.getArea();


    }




}
