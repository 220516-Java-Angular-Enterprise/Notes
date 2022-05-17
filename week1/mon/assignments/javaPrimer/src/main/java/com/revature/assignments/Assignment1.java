package com.revature.assignments;

public class Assignment1 {
    public static String sum(int a, int b) { return String.format("sum = %d", a+b); }

    public static String isEven(int a) { return a % 2 == 0 ? "YES" : "NO"; }

    public static String abbreviate(String s) {
        return s.length() > 10 ?
                String.format("%s%d%s", s.charAt(0), s.length() - 2, s.charAt(s.length() - 1)) :
                s;
    }
}