package com.revature.access.publicsAccess.package1;

public class SamePackageSubclassNonSubclass {

    public static void main(String[] args){
        AccessMod am = new AccessMod();
        // no error
        am.canYouseeMe();
    }

}