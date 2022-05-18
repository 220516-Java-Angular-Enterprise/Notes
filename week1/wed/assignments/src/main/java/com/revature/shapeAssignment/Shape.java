package com.revature.shapeAssignment;

public abstract class Shape {
    //region <attributes>
    protected int x;
    protected int y;
    //endregion

    // region <abstract methods>
    public abstract double calculateArea();
    public abstract double calculateCircumference();
    //endregion
}
