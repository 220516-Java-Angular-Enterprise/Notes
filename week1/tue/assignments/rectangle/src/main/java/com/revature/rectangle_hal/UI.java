package com.revature.rectangle_hal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UI {
    public static void main(String[] args) {
        Rectangle r = new Rectangle("r1",12,12);
        System.out.println(r.getareas());
        ArrayList<Rectangle> rList = new ArrayList<>();

        int i=0;
        for (i=0; i<=10;i++){
            Random rand1 =new Random();
            Random rand2 = new Random();
            Rectangle newr = new Rectangle(rand1.nextInt(1),rand2.nextInt(20));
            rList.add(newr);
        }
        for (i=0; i<=10;i++){
    }

}