package com.revature.assignment;

public class Triangle implements Shape{

    private double height;
    private double base;

    public Triangle(){
    }

    public Triangle(double height, double base) throws MeasurementException {
        this.height = height;
        this.base = base;
        checkMeasurement();
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }


    public void setHeight(double height) throws MeasurementException {
        this.height = height;
        checkMeasurement();
    }

    public void setBase(double base) throws MeasurementException {
        this.base = base;
        checkMeasurement();
    }

    @Override
    public double calculateArea() {
        return .5*base*height;
    }

    @Override
    public double calculateCircumference() {
        return 3*base;
    }

    @Override
    public void checkMeasurement() throws MeasurementException {
        if (height <=0 || base <= 0){
            throw new MeasurementException("Must be greater than 0");
        }

    }
}
