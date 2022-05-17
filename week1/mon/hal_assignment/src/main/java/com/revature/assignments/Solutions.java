package com.revature.assignments;

public class Solutions {
    //add two integers//
    public String sumofTwoNum(int a, int b) {
        int sum = a + b;
        return "the sum of " + a + ", " + b + " is " + sum;
    }

    //return yes if even//
    //no if odd//
    public String evenOdd(int a) {
        if (a % 2 == 0) {
            return (a + " is an even int");
        } else {
            return (a + " is an odd int");
        }
    }

    //if string length is strictly 10+ characters//
    //string should be replaced with special abbreviation//
    //else, return the word//
    public String abbreviate(String c) {
        int n = c.length();
        if (n >= 10) {
            int word_len = (n - 2);
            String p = String.valueOf(word_len);
            char first = c.charAt(0);
            char last = c.charAt(n - 1);

            String first1 = String.valueOf(first);
            String last1 = String.valueOf(last);

            return first1+p+last1;
        }else {
            return c;
        }

    }


}
