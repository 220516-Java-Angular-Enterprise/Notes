package com.revature.assignment;

public class Circle implements Shape {
    private double radius;

    public Circle(){
        super();
    }

    public Circle(double radius) throws MeasurementException {
        this.radius = radius;
        checkMeasurement();

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws MeasurementException {
        this.radius = radius;
        checkMeasurement();
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }

    public void checkMeasurement() throws MeasurementException {
        if(radius <= 0){
            throw new MeasurementException("\nInvalid");
        }
    }


}