package com.revature.demo;

public class Solution {
        //    problem 1: finding the sum
        public int sumOfTwoNumbers(int a, int b) {

            return a + b;
        }

//        problem 2: find even or odd num
    public String evenOdd(int a) {
        if (a % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }

//    problem 3: abbreviation string
    public String abr(String s) {
//            count the length of the word
        int sleng = s.length();

        if (sleng <= 10) {
//            prints out original word
            System.out.println(s);
        } else {
//            print out first character
            System.out.print(s.charAt(0));
//            prints the int of char between i[0] and length
            System.out.print(sleng - 2);
//            print out last char (need -1 or get out of length error)
            System.out.print(s.charAt(sleng - 1));

        }
        return "";
    }
}