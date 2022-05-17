package com.revature.assignment1;
/*Q1*/
public class Main {
public int Easy(int a, int b){

    return a+b;
}

/*Q2*/
    public String moderate (int a){
    if (a%2!=0) {
        return "NO!";
    }
    else
        return "Yes!";
    }

    public String FinalBoss(String c){
   if(c.length()>10){
       return(c.charAt(0)+c.length()-2+c.substring(c.length()-1));
   }
   else
       return c;

    }
        }
