package com.revature.solutions;

public class Solutions {
    private int a;
    private int b;
    private int sum;

    public int getSum(){
        return this.sum;
    }

    public Solutions (int a, int b){
        this.a = a;
        this.b = b;
        this.sum=a+b;
    }
    public String isEven(){
        if (this.a%2==0) {
            return "a is EVEN";
        } else{
            return "a is ODD";
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
