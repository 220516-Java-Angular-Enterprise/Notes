package com.revature.assignment;

interface Shape{
    double calculateArea();
    double calculateCircumference();
    void checkMeasurement() throws MeasurementException;
}