package com.revature.problem;

import java.util.*;

public class Solution {

    public int mostRecurringInteger(String s) {
        if(s.length() == 0) return 0;
        else if(s.length() ==1 )return Character.getNumericValue(s.charAt(0));

        char[] cArr = s.toCharArray();
        int maxCount=0, count=1;
        char recurring=' ';

        //looping through the array
        for(int i =0; i+1<cArr.length; i++){
            //if the current element is the same as the next element increment the count
            if(cArr[i] == cArr[i+1])
                count++;

            //if the current element does not equal the next then it is a new recursion
            //if the current element is the same as the last then we need to indicate to finalize
            //length-2 will retrieve second to last element index
            if(cArr[i] != cArr[i+1] || i==cArr.length-2){
                //if the count is greater than the max count from previous element then update it with the count variable
                if(count>maxCount){
                    maxCount = count;
                    //assign the new element
                    recurring = cArr[i];
                }
                //reset the count back to 0 to check for a new max count if there is one
                count =1;
            }
        }

        return Character.getNumericValue(recurring);
    }
}
