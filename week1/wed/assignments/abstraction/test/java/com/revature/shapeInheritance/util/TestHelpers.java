package com.revature.shapeInheritance.util;

public class TestHelpers {
    public static int getPrecision(String a, String b, int precTarget) {
        int start = a.indexOf('.');
        if(start != b.indexOf('.')) return 0;
        // If the whole numbers aren't even the same

        start++;
        while ((a.charAt(start) | b.charAt(start)) == '0'){
            start++;
            if (start == Math.min(a.length(), b.length())) {
                return start;
                //nothing but 0s here
            }
        }
        // No longer on leading zeros

        int prec = 0;
        while (prec < precTarget && (a.charAt(start+prec) == b.charAt(start+prec))) {
            prec++;
        }
        return prec;
    }
}
