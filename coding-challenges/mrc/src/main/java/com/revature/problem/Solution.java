package com.revature.problem;

public class Solution {

    public int mostRecurringInteger(String s) {


        //<editor-fold desc="Fail conditions">
        if (s.length() == 0){
            throw new RuntimeException("Expecting string of at least 1 number.");
        }

        //https://stackoverflow.com/questions/15111420/how-to-check-if-a-string-contains-only-digits-in-java
        //https://www.javatpoint.com/java-regex
        //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        if (! s.matches("^[0-9]+")){
            throw new RuntimeException("Expecting only numbers.");
        }
        //</editor-fold>


//11222111
        char curMax = s.charAt(0);;
        char curChar = s.charAt(0);

        int maxCount = 0;
        int currentCount = 0;
        for(char c : s.toCharArray()){
            if (c == curChar){
                currentCount += 1;
            }
            else if (currentCount > maxCount) {
                maxCount = currentCount;
                currentCount = 1;
                curMax = curChar;
                curChar = c;
            }
            else{
                curChar = c;
                currentCount = 1;
            }
        }
        if (currentCount > maxCount){
            curMax = curChar;
        }

        return Character.getNumericValue(curMax);
    }
}
