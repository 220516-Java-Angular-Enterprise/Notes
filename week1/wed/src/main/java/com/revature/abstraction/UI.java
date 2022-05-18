package com.revature.abstraction;

public class UI {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        Rectangle r = new Rectangle(3, 4);
        Triangle t = new Triangle(3.0);

        System.out.println(c);
        System.out.println(r);
        System.out.println(t);

        c.setRadius(3.3);
        System.out.println(c);

    }

}
