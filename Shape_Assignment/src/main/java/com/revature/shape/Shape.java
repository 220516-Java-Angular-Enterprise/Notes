package com.revature.shape;

public abstract class Shape {
    protected int x;
    protected int y;

    public abstract double calculateArea();
    public abstract double calculateCircumference();
    public double truncate (double value){
        int tru = (int)(value*100);
        value = (double)(tru)/100;
        return value;
    }
}
