package java.com.revature.shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle (double h, double w){
        this.height=h;
        this.width=w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.height*this.width;
    }

    @Override
    public double calculateCircumference() {
        return (this.height+this.width)*2;
    }
}
