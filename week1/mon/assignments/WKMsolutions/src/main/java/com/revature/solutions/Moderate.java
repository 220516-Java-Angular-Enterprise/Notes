package com.revature.solutions;

public class Moderate {
    private int a;
    public Moderate (int a){
        this.a = a;
    }
    public String isEven(){
        if (this.a%2==0) {
            return "YES";
        } else{
            return "NO";
        }
    }
}
