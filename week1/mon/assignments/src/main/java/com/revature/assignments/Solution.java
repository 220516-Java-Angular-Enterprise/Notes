package com.revature.assignments;

public class Solution {
    public int sumOfTwoNums(int n1, int n2){
        int total = n1+n2;
        return total;
    }

    public String oddOrEven(int n){
        if(n%2==0 && n!=0){
            return "YES";
        }
        return "NO";
    }

    public String abbreviation(String s){
        if(s.length()<=10){
            return s;
        }else{
            /* first way of doing things*/
            char firstLetter = s.charAt(0);
            char lastLetter = s.charAt(s.length()-1);
            int length = s.length()-2;
            String abbreviated = firstLetter+Integer.toString(length)+lastLetter;
            //second way of doing things
            String abbreviated2 = s.substring(0,1)+(s.length()-2)+s.substring(s.length()-1);
            return abbreviated;
        }

    }
}
