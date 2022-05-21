package com.revature.problem;

public class Solution {

    public int mostRecurringInteger(String s) {
        int temporaryVal = 0;
        int most = 0;
        int temporaryCount = 0;
        int mostCount = 0;

        for(int i = 0; i < s.length(); i++){
            if(temporaryVal == Character.getNumericValue(s.charAt(i))){
                temporaryCount++;
            }
            else{
                temporaryVal = Character.getNumericValue(s.charAt(i));
                temporaryCount = 1;

            }
            if(temporaryCount > mostCount){
                mostCount = temporaryCount;
                most = temporaryVal;
            }
        }
        return most;
    }
}