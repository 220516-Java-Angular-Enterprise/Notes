package com.revature.assignments1;

public class Solution {
    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public String oddEven(int a) {
        if (a % 2 != 0) {
            return "Odd";
        } else {
            return "Even";
        }
    }

    public String length(String a) {
        if (a.length() <= 10) {
            return a;
        } else {
            int number = a.length() - 2;
            String numberText = number + "";
            String b = a.charAt(0) + numberText + a.charAt(a.length() - 1);

            return b;
        }
    }
}
