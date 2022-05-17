import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        List<Rectangle> rectangleList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Rectangle testRectangle = new Rectangle();

        Random generator = new Random();

        for(int i = 0; i < 10; i++) {
            String rectangleName = scanner.next();
            rectangleList.add(new Rectangle(rectangleName, generator.nextInt(500), generator.nextInt(500)));
        }
        for(Rectangle rectangle: rectangleList){
            System.out.println(rectangle);
        }
System.out.println();

        System.out.println("The rectangle with the largest area is: "+
                testRectangle.findAreaMax(rectangleList));
        System.out.println("The rectangle with the largest perimeter is: "
                + testRectangle.findPerimeterMax(rectangleList));

    }
}
