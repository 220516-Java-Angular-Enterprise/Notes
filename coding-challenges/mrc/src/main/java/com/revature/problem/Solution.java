package com.revature.problem;



public class Solution {

    public int mostRecurringInteger(String s) {

        // Iterate through the string and count the number of times a number has reoccurred. Store the max reoccurance
        // number and return it.

        int maxInt; int curInt = 0; int maxRec = 1; int curRec = 1;
        if (s.length() == 0) return 0;


            maxInt = Integer.parseInt(String.valueOf(s.charAt(0)));
            for (int i = 1; i < s.length(); i++) {
                curInt = Integer.parseInt(String.valueOf(s.charAt(i)));
                if (curInt == Integer.parseInt(String.valueOf(s.charAt(i - 1)))) {
                    curRec++;
                }
                else curRec = 1;

                if (maxRec < curRec) {
                    maxRec = curRec;
                    maxInt = curInt;
                }
            }
            return maxInt;

    }
}
/*
    111222333444
    mI: 1, cI: 0, mR: 1, cR: 1

    s.len = 12
    cI: 1 cR: 2 mR: 2 m1: 1

    11
    cI: 1 cR: 3 mR3 mI: 1

    10
    cI: 2 cR: 1 mR: 3 mI: 1

    9
    cI: 2 cR: 2 mR: 3 mI: 1

    8
    cI: 2 cR: 3 mR: 3 mI: 1



 */