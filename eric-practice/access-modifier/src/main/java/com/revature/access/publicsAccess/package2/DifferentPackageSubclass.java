package com.revature.access.publicsAccess.package2;

import com.revature.access.publicsAccess.package1.AccessMod;

public class DifferentPackageSubclass extends AccessMod{

    public static void main(String[] args){
        AccessMod am = new AccessMod();
        // no error
        am.canYouseeMe();
    }
}
