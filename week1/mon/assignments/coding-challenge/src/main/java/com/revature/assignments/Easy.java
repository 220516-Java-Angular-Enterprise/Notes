package com.revature.assignments;

public class Easy {
    private int a;
    private int b;

    public Easy(){
        this.a = 0;
        this.b = 0;
    }
    public Easy(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public int solution(){
        return a+b;
    }

    @Override
    public String toString() {
        return Integer.toString(a+b);
    }
}
