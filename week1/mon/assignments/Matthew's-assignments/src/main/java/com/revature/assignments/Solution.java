package com.revature.assignments;

public class Solution {
    public int sumOfTwoNum(int a, int b){
        return a+b;
    }

    public String evenOdd(int a){
        if (a%2 == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public String abbreviation(String a){
        if (a.length() > 10){
            return ""+ a.charAt(0)+ (a.length()-2) + a.charAt(a.length() - 1);
        }
        return a;
    }
}
