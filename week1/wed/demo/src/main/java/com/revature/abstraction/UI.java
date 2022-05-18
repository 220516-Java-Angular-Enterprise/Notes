package com.revature.abstraction;


import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;

public class UI {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        double radius = scan.nextDouble();

        System.out.println("Enter rectangle height: ");
        double recHeight = scan.nextDouble();

        System.out.println("Enter rectangle width: ");
        double recWidth = scan.nextDouble();

        System.out.println("Enter triangle height: ");
        double triHeight = scan.nextDouble();

        System.out.println("Enter triangle base: ");
        double triBase = scan.nextDouble();


        Circle circle = new Circle(radius);
        Rectangle rec1 = new Rectangle(recHeight, recWidth);
        Triangle tri1 = new Triangle(triHeight, triBase);

        System.out.println(circle);
        System.out.println(rec1);
        System.out.println(tri1);
    }
}
