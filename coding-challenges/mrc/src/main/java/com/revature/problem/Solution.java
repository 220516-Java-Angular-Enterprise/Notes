package com.revature.problem;

public class Solution {

    public int mostRecurringInteger(String s) {
        // s.toCharArray() returns an array of the string and then i save it to the list variable
        int globalMax = 0;
        int localMax = 1;

        // if s is "" this this if will be executed
        if(s.length() == 0){
            return 0;
        }

        // if s is length 1 for example ("2") or 2  ("27") the first element will aways be the anwser
        if (s.length() == 1 || s.length() == 2){
            return Character.getNumericValue(s.charAt(0));
        }

        // iterate through string list. have a counter of local max if the element look at  and the element ahead
        // of it are the same then count the element. check with each iteration if the local max is bigger than
        // the global max if so then we know  the element we are look at so far is the most reoccuring
        int aws = Character.getNumericValue(s.charAt(0));
        for (int i=0;i< s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                localMax += 1;
                if (localMax > globalMax){
                    globalMax = localMax;
                    aws = Character.getNumericValue(s.charAt(i));
                }
            }else{
                localMax = 1;
            }
        }
        return aws;

    }
}
