package com.revature.access.test.protectedAccess.package2;

import com.revature.access.test.protectedAccess.package1.AccessMod;

public class DifferentPackageNonSubclass {

    public static void main(String[] args){
        AccessMod am = new AccessMod();
        // no error
        am.canYouseeMe();
    }
}