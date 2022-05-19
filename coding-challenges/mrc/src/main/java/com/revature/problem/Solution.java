package com.revature.problem;

import java.util.ArrayList;

public class Solution {

    public int mostRecurringInteger(String s) {
        char[] list = s.toCharArray();
        int globalMax = 0;
        int localMax = 1;
        int aws = Character.getNumericValue(list[0]);

        if(s.length() == 0){
            return 0;
        }

        if (s.length() == 1 || s.length() == 2){
            return Character.getNumericValue(list[0]);
        }

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
