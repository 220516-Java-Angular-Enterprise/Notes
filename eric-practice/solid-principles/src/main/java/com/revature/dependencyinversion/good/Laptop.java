package com.revature.dependencyinversion.good;


public class Laptop {
    private final HardDrive hd;

    // responsability of creating the object is given to the framework such as Spring
    // @Injection
    public Laptop(HardDrive hd){
        this.hd = hd;
    }

    public void laptopSave(){hd.savedata();}

}
