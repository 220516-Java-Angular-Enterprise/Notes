package com.revature.problem;

public class Solution {

    public int mostRecurringInteger(String s) {
        // s.toCharArray() returns an array of the string and then i save it to the list variable
        int globalMax = 0;
        int localMax = 0;
        int l = s.length();


        // if s is "" this, this will be executed
        if(l == 0){
            return 0;
        }

        int aws = Character.getNumericValue(s.charAt(0));
        int  prev = Character.getNumericValue(s.charAt(0));
        for (int i=0;i< l; i++){
            try {
                correctInput(s.charAt(i));
                Character.getNumericValue(s.charAt(0));
                if  (Character.getNumericValue(s.charAt(i)) == prev){
                    localMax ++;
                    if (localMax > globalMax){
                        globalMax = localMax;
                        aws = Character.getNumericValue(s.charAt(i));
                        if (globalMax > l-i) {
                            return aws;
                        }
                    }

                }else{
                    localMax = 1;
                }
                prev = Character.getNumericValue(s.charAt(i));
            } catch (InputException e){
                return -1;
            }
        }
        return aws;

    }
    private boolean correctInput(char c){
        if (Character.getNumericValue(c) >= 10 || Character.getNumericValue(c) == -1){
            throw new InputException("Invalid String");
        } else{return true;}
    }

}
