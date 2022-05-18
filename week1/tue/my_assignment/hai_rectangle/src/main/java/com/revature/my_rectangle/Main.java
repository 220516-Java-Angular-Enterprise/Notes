package com.revature.my_rectangle;
import java.util.*;

public class Main {
static Random randomInt = new Random();


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Rectangle> rectangles = new LinkedList<>();
        rectangles = createTenRect();  // Create 10 random rectangles and push into rectangles list

    System.out.println("Hello! Enter name to see the 10 sacred rectangles: "); // Ask for user input
    String name = input.nextLine();    // Puts user input to String name

    System.out.println("Ahh yes, " + name + ". Thou may proceed...");
    System.out.println(rectangles);
    System.out.println(findMaxArea(rectangles));
    System.out.println(findMaxPerimeter(rectangles));
    }



    public static List<Rectangle> createTenRect(){
        List<Rectangle> list = new LinkedList<>();
        int i = 0;
        while (i < 11) {
            int randomLength = randomInt.nextInt(100);
            int randomWidth = randomInt.nextInt(100);
            list.add(new Rectangle( "a" + i, randomLength, randomWidth));
            i++;

        }
        return list;
    }

    public static String findMaxArea(List<Rectangle> list){
        Rectangle max = new Rectangle();
        for(int i = 0; i < list.size(); i++){
            if (max.getArea() < list.get(i).getArea()) {
                max = list.get(i);
            }
        }
        return "The largest area rectangle is: " + max + "with the area of: " + max.getArea();
    }

    public static String findMaxPerimeter(List<Rectangle> list){
        Rectangle max = new Rectangle();
        for(int i = 0; i < list.size(); i++){
            if (max.getPerimeter() < list.get(i).getPerimeter()) {
                max = list.get(i);
            }
        }
        return "The largest perimeter rectangle is: " + max + "with the perimeter of: " + max.getPerimeter();
    }

}
