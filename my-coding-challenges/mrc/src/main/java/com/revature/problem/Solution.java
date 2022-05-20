package com.revature.problem;

public class Solution {

    public void main(String args[]){
        System.out.println(mostRecurringInteger("1223334444"));
    }

    public int mostRecurringInteger(String s) {
    int maxCount= 0;
    int currentCount = 0;
    int mostRecurringNum = 0;
    int currentNum = 0;


    for (int i=0; i < s.length(); i++) {
        if (Character.getNumericValue(s.charAt(i)) != currentNum) {
            currentCount = 1;
            currentNum = Character.getNumericValue(s.charAt(i));

        } else {
            currentCount++;
        }
        if (currentCount > maxCount) {
            maxCount = currentCount;
            mostRecurringNum =currentNum;
        }

        System.out.println("MostCount: " + maxCount);
        System.out.println("mostRecurringNum: " + mostRecurringNum);
        System.out.println("currentCount: " + currentNum);
        System.out.println("currentNum: " + currentNum + "\n");
        }


        return mostRecurringNum;

    }
    }





