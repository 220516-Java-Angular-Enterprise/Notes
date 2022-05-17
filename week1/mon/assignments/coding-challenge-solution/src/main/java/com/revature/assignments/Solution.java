package com.revature.assignments;

public class Solution {

    public int sumOfTwoNum(int a, int b) {
        return a + b;
    }

    public String evenOdd(int a) {
        if (a % 2 == 0) return "EVEN";

        return "ODD";
    }

    public String abbreviation(String s) {
        if (s.length() > 10) return s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1);

        return s;
    }
}
