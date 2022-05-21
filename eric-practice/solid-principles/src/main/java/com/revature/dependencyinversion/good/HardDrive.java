package com.revature.dependencyinversion.good;

// Spring indicates that this is a service
// @Service
public class HardDrive {
    private String street;

    public HardDrive(){
    }
    public void savedata(){System.out.println("save data to Hard-drive");}
}
