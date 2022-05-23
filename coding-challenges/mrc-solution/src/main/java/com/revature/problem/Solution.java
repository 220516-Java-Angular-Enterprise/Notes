package com.revature.problem;

public class Solution {

    public int mostRecurringInteger(String s) {
        char temp = ' ';
        int count = 0;
        int num = 0;
        int max = 0;


        for (char c : s.toCharArray()) {
            if (c != temp) {
                temp = c;
                count = 1;
            } else count++;

            if (max < count) {
                max = count;
                num = Integer.parseInt(String.valueOf(c));
            }
        }

        return num;
    }
}
