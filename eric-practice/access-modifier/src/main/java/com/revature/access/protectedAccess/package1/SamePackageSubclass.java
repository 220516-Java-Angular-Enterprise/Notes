package com.revature.access.protectedAccess.package1;

public class SamePackageSubclass extends AccessMod {

    public static void main(String[] args){
        SamePackageSubclass am = new SamePackageSubclass();
        // no error
        am.canYouseeMe();
    }

}
