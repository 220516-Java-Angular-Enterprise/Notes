package com.revature.liskov;


public class UI {
    public static void main(String[] args){
        UI ui = new UI();

        Employee employee = new Employee(1,"Tom");


        TrainedEmployee employeeT = new TrainedEmployee(2, "Jim","Boulder");

        ui.useMeToPrint(employee);
        // Trained is able to be subsituted as an employee as it follows liskov sub principles
        ui.useMeToPrint(employeeT);
    }

    public void useMeToPrint(Employee e){
        e.printMe();
    }
}
