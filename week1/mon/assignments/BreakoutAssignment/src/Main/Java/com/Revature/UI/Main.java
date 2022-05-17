//Alec Guarino

package com.Revature.UI;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static enum RectangleComparison {
        PERIMETER,
        AREA
    }

    static ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

    public static void main (String[] args){
        //<editor-fold desc="Rectangle creation">
        /*
        rectangles.add( new Rectangle("First", 5, 10) );
        rectangles.add( new Rectangle("Second", 65, 67) );
        rectangles.add( new Rectangle("Third", 1, 163) );
        rectangles.add( new Rectangle("Fourth", 65, 87) );
        rectangles.add( new Rectangle("Fifth", 3, 65) );
        rectangles.add( new Rectangle("Sixth", 67, 21) );
        rectangles.add( new Rectangle("Seventh", 58, 32 ) );
        rectangles.add( new Rectangle("Eigth", 94, 68) );
        rectangles.add( new Rectangle("Ninth", 45, 35) );
        rectangles.add( new Rectangle("Tenth", 34, 16) );
        */

        Random number = new Random();
        for( int i = 1 ; i <= 10 ; i ++ ) {
            rectangles.add( new Rectangle( Integer.toString(i), number.nextInt(), number.nextInt() ) );
        }

        //</editor-fold>

        System.out.println("Rectangles:");
        for (Rectangle r : rectangles){
            System.out.println(r);
        }

        System.out.println( "Max Perimeter: " + findMax(RectangleComparison.PERIMETER) );
        System.out.println( "Max Area: " + findMax(RectangleComparison.AREA) );
    }

    public static Rectangle findMax(RectangleComparison comparisonType){
        ComparatorArea compareArea = new ComparatorArea();
        ComparatorPerimeter comparePerim = new ComparatorPerimeter();

        Rectangle biggestRect = rectangles.get(0);
        if(comparisonType == RectangleComparison.PERIMETER) {
            for (Rectangle r : rectangles) {
                if (comparePerim.isLessThan(biggestRect, r)) {
                    biggestRect = r;
                }

            }
        }
        else{
            for (Rectangle r : rectangles) {
                if (compareArea.isLessThan(biggestRect, r)) {
                    biggestRect = r;
                }

            }
        }


        return biggestRect;
    }

}
