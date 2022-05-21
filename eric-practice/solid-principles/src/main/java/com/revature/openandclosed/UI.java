package com.revature.openandclosed;

public class UI {
    public static void main(String[] args){
        Employee employee = new Employee(1,"Tom");
        employee.printMe();

        TrainedEmployee employeeT = new TrainedEmployee(2, "Jim","Boulder");
        employeeT.printMe();
    }
}
