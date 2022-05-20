package com.revature.problem;

public class Solution {

    public int mostRecurringInteger(String s) {
        int mostRecurring = 0;
        int temp = 0;

        int mostRecurringCount = 0;
        int tempCount = 0;

        for(int i = 0; i < s.length(); i++){
            if(temp != Character.getNumericValue(s.charAt(i))){
                temp = Character.getNumericValue(s.charAt(i));
                tempCount = 1;
            }
            else{
                tempCount++;
            }
            if(tempCount > mostRecurringCount){
                mostRecurring = temp;
                mostRecurringCount = tempCount;
            }

            System.out.println("mostRecurring: " + mostRecurring);
            System.out.println("mostRecurringCount: " + mostRecurringCount);
            System.out.println("temp: " + temp);
            System.out.println("tempCount: " + tempCount);
            System.out.println();
        }
        return mostRecurring;
    }
}
