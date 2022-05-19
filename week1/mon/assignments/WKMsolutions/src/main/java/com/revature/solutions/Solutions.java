package com.revature.solutions;

public class Solutions {
    private int a;
    private int b;
    private int sum;



    public int getSum(int a, int b){
        return a+b;
    }

    public String isEven(int a){
        if (a%2==0) {
            return "EVEN";
        } else{
            return "ODD";
        }
    }
    public String truncate(String s) {
        if (s.length() <= 10) {
            return s;
        } else {
            String sLength=String.valueOf(s.length()-2);
            String outString="";
            outString=s.charAt(0)+sLength+s.charAt(s.length()-1);
            return outString;

        }
    }
}
