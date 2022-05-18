package com.revature.rectangle_hal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        List<Rectangle> rList = new ArrayList<>();

        int i = 0;
        for (i = 0; i <= 10; i++) {
            System.out.print("Enter in rectangle name: ");
            Rectangle rect = new Rectangle(scan.nextLine(), rand.nextInt(1000), rand.nextInt(1000));
            rList.add(rect);
        }
        System.out.println();

        for (Rectangle rect : rList) {
            System.out.println(rect);
        }
        System.out.println("\n Max area "+ new Rectangle().findMaxArea(rList, new Comparator()) );
        System.out.println("\n Max perimeter "+ new Rectangle().findMaxPerimeter(rList, new Comparator()) );
    }}