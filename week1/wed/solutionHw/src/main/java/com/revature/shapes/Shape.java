package com.revature.shapes;

//the Shape class is an Interface because it only includes blank methods that MUST be inherited
public abstract class Shape {

//    these abstract methods are required to be used if every child.
    protected abstract double calculateArea();
    protected abstract double calculateCircumference();
}