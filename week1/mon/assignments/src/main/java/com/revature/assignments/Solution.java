package com.revature.assignments;

public class Solution {
    public int sumOfTwoNum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public String evenOdd(int a){

        if (a % 2 == 0) {
            return "EVEN";
        } else {
           return "ODD";
        }
    }
    public String abr(String s){
//        getting length of string
        char[] stringArray = s.toCharArray();
        int length = stringArray.length;
//        getting middle number
        int lengthMinusTwo = length - 2;
//        getting last character
        char lastChar = stringArray[stringArray.length-1];
           if (length > 10) {
//         putting it together
            String phrase = String.format("%c%d%c", stringArray[0], lengthMinusTwo, lastChar);
            return phrase;
        } else {
            return s;
        }
    }
}