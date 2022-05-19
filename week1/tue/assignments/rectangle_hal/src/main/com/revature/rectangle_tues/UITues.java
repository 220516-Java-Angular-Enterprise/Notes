package week1.tue.assignments.rectangle_hal.src.main.com.revature.rectangle_tues;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UITues {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        List<RectangleTues> rectangles = new ArrayList<>();

        int i = 0;
        while (i <= 5) {
            try {
                System.out.print("Enter in rectangle name: ");
                RectangleTues rect = new RectangleTues(scan.nextLine(), (rand.nextInt(1000 + 1000) - 1000), (rand.nextInt(1000 + 1000) - 1000));
                rectangles.add(rect);

                i++;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("\n");
            }
        }

        System.out.println();

        for (RectangleTues rect : rectangles) {
            System.out.println(rect);
        }

        System.out.println("\nMax area: " + new RectangleTues().findMaxArea(rectangles, new ComparatorTues()));
        System.out.println("\nMax perimeter: " + new RectangleTues().findMaxPerimeter(rectangles, new ComparatorTues()));
    }
}
