 package com.revature.shapes;

public abstract class Shape {
    protected int x;
    protected int y;

    public abstract double calculateArea();
    public abstract double calculateCircumference();
    public double truncate(double value){
        int trun = (int)(value*100);
        value = (double)(trun)/100;
        return value;

    }
}