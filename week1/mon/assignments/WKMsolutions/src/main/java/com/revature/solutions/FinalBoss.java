package com.revature.solutions;

public class FinalBoss {


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
