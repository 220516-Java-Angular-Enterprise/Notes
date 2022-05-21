package com.revature.openandclosed;

public class TrainedEmployee extends Employee{

    private String trainingAreas;

    // Employees was open for extention and by creating this TrainedEmployee it is closed for modification

    TrainedEmployee(int id, String name,String trainingAreas) {
        super(id, name);
        this.trainingAreas = trainingAreas;
    }
}
