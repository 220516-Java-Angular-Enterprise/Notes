package com.revature.access.privateAccess.package2;

import com.revature.access.privateAccess.package1.AccessMod;

public class DifferentPackageSubclass extends AccessMod {

    public static void main(String[] args){
        AccessMod am = new AccessMod();
        // error
        am.canYouseeMe();
    }
}
