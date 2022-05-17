package com.revature.assignments;

public class Medium {
    private int c;

    public Medium(){
        this.c = 0;
    }

    public void setC(int c){
        this.c = c;
    }

    public String solution(){

        if (c%2==0){
            return "YES";
        } else{
            return "NO";
        }
    }

    @Override
    public String toString() {
        if (c%2==0){
            return "YES";
        } else{
            return "NO";
        }
    }
}
