package java.com.revature.Rectangle;



public class Rectangle {
    private String name;
    private int length;
    private int width;
//constructor with parameters
    public Rectangle (String name, int length, int width){
        this.name = name;
        this.width = width;
        this.length = length;
    }
//constructor without parameters
    public Rectangle (){
    }
//getters and setters
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
//get area function

    public int getArea(){
        return this.length*this.width;
    }
//get perimeter function

    public int getPerimeter(){
        return 2*(this.length+this.width);
    }

    //toString method to return a readable string.
    

    public String toString(){
        return "Name: "+this.getName()+" Length: "+String.valueOf(this.getLength())+" Width: "+String.valueOf(this.getWidth());
    }
    public int findMaxArea(Rectangle[] recs){
        Comparator comparator= new Comparator();
        int maxIndex  = 0;
        for (int i=0; i<recs.length;i++){
            if (comparator.areaIsLessThan(recs[maxIndex], recs[i])){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public int findMaxPerimeter(Rectangle[] recs){
        Comparator comparator= new Comparator();
        int maxIndex  = 0;
        for (int i=0; i<recs.length;i++){
            if (comparator.perimeterIsLessThan(recs[maxIndex], recs[i])){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
