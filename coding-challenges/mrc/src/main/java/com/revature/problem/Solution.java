package com.revature.problem;

import java.util.ArrayList;

public class Solution {

    public int mostRecurringInteger(String s) {
        // s.toCharArray() returns an array of the string and then i save it to the list variable
        char[] list = s.toCharArray();
        int globalMax = 0;
        int localMax = 1;
        int aws = Character.getNumericValue(list[0]);

        // if s is "" this this if will be executed
        if(s.length() == 0){
            return 0;
        }

        // if s is length 1 for example ("2") or 2  ("27") the first element will aways be the anwser
        if (s.length() == 1 || s.length() == 2){
            return Character.getNumericValue(list[0]);
        }

        // iterate through string list. have a counter of local max if the element look at  and the element ahead
        // of it are the same then count the element. check with each iteration if the local max is bigger than
        // the global max if so then we know  the element we are look at so far is the most reoccuring
        for (int i=0;i< list.length - 1; i++){
            if(list[i] == list[i+1]){
                localMax += 1;
                if (localMax > globalMax){
                    globalMax = localMax;
                    aws = Character.getNumericValue(list[i]);
                }
            }else{
                localMax = 1;
            }
        }
        return aws;

    }
}
