import java.util.*;

public class Rectangle {

    // attributes
    private String name;
    private int length;
    private int width;

    public Rectangle(){

    }
    public Rectangle(String name, int length, int width){
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public String toString() {
        return "Rectangle "+ this.name +
                " has a length of " + this.length +
                " and a width of " + this.width;
    }

    public Rectangle findAreaMax(List<Rectangle> list){
        AreaComparator a = new AreaComparator();
        Rectangle max = new Rectangle();

        if(!list.isEmpty()){
            for(Rectangle rectangle: list){
                if(a.isLessThan(max, rectangle)){
                    max = rectangle;
                }
            }
        }
        return max;
    }

    public Rectangle findPerimeterMax(List<Rectangle> list){
        PerimeterComparator p = new PerimeterComparator();
        Rectangle max = new Rectangle();

        if(!list.isEmpty()){
            for(Rectangle rectangle: list){
                if(p.isLessThan(max, rectangle)){
                    max = rectangle;
                }
            }
        }
        return max;
    }
}
