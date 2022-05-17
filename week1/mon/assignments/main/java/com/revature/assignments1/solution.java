package com.revature.assignments1;

public class solution {
    public int Add(int a, int b) {
        int c = a + b;
        return c;
    }

    public String oddEven(int a) {
        if (a % 2 != 0) {
            return "No";
        } else {
            return "Yes";
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
