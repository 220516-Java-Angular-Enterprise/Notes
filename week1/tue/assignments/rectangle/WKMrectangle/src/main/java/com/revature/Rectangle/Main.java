package java.com.revature.Rectangle;


import java.util.Random;

public class Main {
    public static void main(String[] args){

    //create 10 rectangles.  Because we were asked to create 10 specifically, I used an array.  It would probably be better to use some manner of list in order to scale up or down.
        Rectangle[] rectArray = new Rectangle[10];
    //create a Random object for randomization

        Random random = new Random();
//in a loop, create each rectangle with a random length and width in the bound 1-100.
        for (int i=0; i<rectArray.length; i++) {
            rectArray[i] = new Rectangle("rectAt" + String.valueOf(i), random.nextInt(100), random.nextInt(100));
            //print the rectangle we just made
            System.out.println(rectArray[i].toString());
            //or, create 10 rectangles with user specified parameters
        }

    //Find the index of the highest perimeter
        int maxArea=rectArray[0].findMaxArea(rectArray);
    //find the index of the highest area
        int maxPerimeter=rectArray[0].findMaxPerimeter(rectArray);

        System.out.println("The largest Area is: "+'\n'+rectArray[maxArea].toString());
        System.out.println("The largest Perimeter is: "+'\n'+rectArray[maxPerimeter].toString());




    }




}
