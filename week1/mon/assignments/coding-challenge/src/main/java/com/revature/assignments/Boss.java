package com.revature.assignments;

public class Boss {
    private String s;
    private int l;

   public Boss(){
       this.s ="";
       this.l =0;
   }
    public Boss(String s) {
        this.s = s;
        this.l = s.length();
    }

    public void setS(String s) {
        this.s = s;
        this.l = s.length();
    }

    public String solution(){
        String anw;

        anw = s;

        if (l > 10){
          anw = s.charAt(0) + Integer.toString(l-2) + s.charAt(l-1);
          return anw;
        } else{
            return anw;
        }
    }

    @Override
    public String toString(){
        String anw;
        anw = s;
        if (l > 10){
            anw = s.charAt(0) + Integer.toString(l-2) + s.charAt(l-1);
            return anw;
        } else{
            return anw;
        }
    }
}
