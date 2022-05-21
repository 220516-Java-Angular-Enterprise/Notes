package com.revature.dependencyinversion.bad;

public class Laptop {
    // bad beacuse of tight coupling (Two classes are highly dependent of each other)
    // it is bad beacuse a change in one class requires a change in another class
    // Say we wanted to used a different hardrive it would require us to change
    // the class

    private final HardDrive hd;


    public Laptop(){
        // resposnbility of creating instance of the hardrive is given to the laptop
        // this is not good because if hd fails or even changes it effects the laption class
        this.hd = new HardDrive();
    }

    public void laptopSave(){hd.savedata();}

}
