package com.revature.WKMproblem;

public class Solution {

    public int mostRecurringInteger(String s) {
        //Check to see that the string has length greater than 0.  Empty string returns 0.
        if (s.length()<1) return 0;
//String with only one character returns that integer
        else if (s.length()==1) return Character.getNumericValue(s.charAt(0));

        //With those outliers out of the way, we can look at any other types of strings
        else {
            //Start with the character at the beginning.  If the length is 1 or higher, maxRecur is at least 1.
            int maxRecur = 1;
            int recurInt = s.charAt(0);
            int thisRecur = 1;
            for (int i = 1; i < s.length(); i++) {
                //compare each character to the previous.  If it matches, increment recurrence. If not, start over.
                int thisInt = Character.getNumericValue(s.charAt(i));
                if (thisInt == Character.getNumericValue(s.charAt(i - 1))) {
                    thisRecur++;
                    if (maxRecur < thisRecur) {
                        maxRecur = thisRecur;
                        recurInt = thisInt;
                    }
                } else {
                    thisRecur = 1;
                }
            }
            return recurInt;
        }
    }
}
