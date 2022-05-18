package com.revature.abstraction;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2.1);
        Rectangle r = new Rectangle(5.2,6.1);
        Triangle t = new Triangle(21.2,5.4);

        System.out.println(c.calculateArea());
        System.out.println(c.calculateCircumference());
        System.out.println(t.calculateArea());
        System.out.println(t.calculateCircumference());
        System.out.println(r.calculateArea());
        System.out.println(r.calculateCircumference());
    }
}
