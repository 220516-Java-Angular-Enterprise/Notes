package java.com.revature.shapes;

public class Triangle extends Shape{
    private double height;

    // per the specifications, this class produces equilateral triangles
    private double base;

    public Triangle (double h, double b){
        this.height=h;
        this.base=b;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    protected double calculateArea() {
        return (this.base*this.height)/2;
    }

    @Override
    protected double calculateCircumference() {
        return 3*this.base;
    }
}
