package com.revature.assignment3.util;

public class TestHelpers {
    public static int equalsWithPrecision(String a, String b, int precTarget) {
        int start = a.indexOf('.');
        if(start != b.indexOf('.')) return 0;
        int shortest = Math.min(a.length(), b.length());
        // If the whole numbers aren't even the same

        start++;
        while ((a.charAt(start) | b.charAt(start)) == '0'){
            start++;
            if (start == shortest) {
                return start;
                //nothing but 0s here
            }
        }
        // No longer on leading zeros

        int prec = 0;
        while ((start+prec < shortest &&
                prec < precTarget) &&
                (a.charAt(start+prec) == b.charAt(start+prec)))
            prec++;
        return start+prec < shortest ? prec : precTarget;
    }
}
