package com.revature.access.privateAccess.package1;

public class SamePackageSubclass extends AccessMod {

    public static void main(String[] args){
        AccessMod am = new AccessMod();
        // error
        try{
            am.canYouseeMe();
        } catch (Exception e){
            System.out.println("error");
        }
    }

}
