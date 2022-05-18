package com.revature.shapes;

public class UI {

//    to run Circle class
    public static void main(String[] args) {
//        Shape circle = new Circle(2);

        System.out.println(new Circle().calculateArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,4);
    }

    public static void main(String[] args) {
        Shape triangle = new Triangle(3,2);
    }
}