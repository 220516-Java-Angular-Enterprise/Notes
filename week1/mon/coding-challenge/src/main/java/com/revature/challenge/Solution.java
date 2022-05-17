package com.revature.challenge;

public class Solution {
    public int easy(int num1, int num2){
        return num1 + num2;
    }

    public String moderate(int a){
        if(a % 2 == 0) return "Even";

        return "Odd";
    }

    public String finalBoss(String s){
            if (s.length() > 10) return s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1);

            return s;
        }
    }

