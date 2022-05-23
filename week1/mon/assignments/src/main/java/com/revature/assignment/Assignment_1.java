package com.revature.assignment;

public class Assignment_1 {

    // Problem: Easy
    public String problemEasy(int a, int b){
        int sum = a + b;
        return "sum = " + sum;
    }

    // Problem: Moderate
    public String problemModerate(int number){
        if(number % 2 != 1){
            return "YES";
        }
        return "NO";
    }

    // Problem: FINAL BOSS
    public String bossSlayer(String word){
        String output;
        if(word.length() > 10){
            output = String.valueOf(word.charAt(0))
                    + String.valueOf(word.length() - 2)
                    + String.valueOf(word.charAt(word.length() - 1));
        }
        else{
            output = word;
        }
        return output;
    }
}
