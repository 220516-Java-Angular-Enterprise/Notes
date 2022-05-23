package java.com.revature.WKMshapes;

public class Rectangle extends Shape {
    protected double height;
    protected double width;

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
