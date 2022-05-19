package com.revature.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Shape {
    protected int x;
    protected int y;

    abstract double calculateArea();
    abstract double calculateCircumference();

    public Shape(){
        super();
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Rounder
    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
