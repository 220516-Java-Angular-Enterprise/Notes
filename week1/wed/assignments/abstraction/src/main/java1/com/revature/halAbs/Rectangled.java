package week1.wed.assignments.abstraction.src.main.java1.com.revature.halAbs;

public class Rectangled extends Shape{
    private double height;
    private double width;

    public Rectangled(double height, double width) {
        this.height = height;
        this.width = width;
    }


    //* getHeight() getWidth() setHeight(double height) setWidth(double width) *//
    public double getWidth(){return width;}
    public double getHeight() {return height;}

    public void setHeight(double height){this.height=height;}
    public void setWidth(double width){this.width=width;}


    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculateCircumference() {
        return 2*(height*width);
    }
}
