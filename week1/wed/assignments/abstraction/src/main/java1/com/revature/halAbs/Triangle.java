package week1.wed.assignments.abstraction.src.main.java1.com.revature.halAbs;

public class Triangle extends Shape{
    private double height;
    private double base;
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    //* getHeight() getWidth() setHeight(double height) setWidth(double width) *//
    public double getBase(){return base;}
    public double getHeight() {return height;}

    public void setBase(double base){this.base = base;}
    public void setHeight(double height){this.height= height;}

    @Override
    protected double calculateArea() {
        return base*height*0.5;
    }

    @Override
    protected double calculateCircumference() {
        return base*3;
    }
}
