package com.revature.assignment;

public class Rectangle implements Shape {

    private double height;
    private double width;

    public Rectangle(){
    }

    public Rectangle(double height, double width) throws MeasurementException {
        this.height = height;
        this.width = width;
        checkMeasurement();
    }

    public void setHeight(double height) throws MeasurementException {
        this.height = height;
        checkMeasurement();
    }

    public void setWidth(double width) throws MeasurementException {
        this.width = width;
        checkMeasurement();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculateCircumference() {
        return 2*height + 2*width;
    }

    @Override
    public void checkMeasurement() throws MeasurementException {
        if (height <=0 || width <= 0){
            throw new MeasurementException("Invalid Measurements");
        }
    }

}
