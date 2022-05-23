package com.revature.access.publicsAccess.package1;

public class SamePackageSubclass extends AccessMod{

    public static void main(String[] args){
        AccessMod am = new AccessMod();
        // no error
        am.canYouseeMe();
    }

}
