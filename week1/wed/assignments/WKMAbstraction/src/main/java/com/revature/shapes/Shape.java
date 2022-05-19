package java.com.revature.shapes;

public abstract class Shape {

    //all shapes have the coordinates of their enter, x and y
    int x;
    int y;

    //shapes have a method to calculate area
    protected abstract double calculateArea();
    //shapes have a method to calculate perimeter
    protected abstract double calculateCircumference();
}
