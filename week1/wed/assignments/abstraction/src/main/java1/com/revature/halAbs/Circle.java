package week1.wed.assignments.abstraction.src.main.java1.com.revature.halAbs;

public class Circle extends Shape{
    //* Circle Class: Constructor, Circle(double radius) *//
    //* The Circle class constructor will take in a double that represents a radius of a circle.
    // This value should be stored in an instance variable that is private,
    // since we will use mutators and accessors to manipulate and obtain the value of it. *//
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    //* Accessors and Mutators, getRadius() setRadius(double radius) *//
    public double getRadius(){return radius;}

    public void setRadius(double radius){
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
