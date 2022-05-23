package com.revature.access.protectedAccess.package2;

import com.revature.access.protectedAccess.package1.AccessMod;

public class DifferentPackageSubclass extends AccessMod {

    public static void main(String[] args){
        DifferentPackageSubclass am = new DifferentPackageSubclass();
        // no error
        am.canYouseeMe();
    }
}
