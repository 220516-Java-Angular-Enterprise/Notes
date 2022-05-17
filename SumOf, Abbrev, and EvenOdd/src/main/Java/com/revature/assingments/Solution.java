package com.revature.assingments;
public class Solution {
    public int sumOfTwo(int a, int b){

        return a + b;
    }

    public String evenOdd(int c){
        if(c % 2 == 0){
            return "This number is Even\n";
        }
        else
            return "This number is Odd\n";
    }

    public String abbrevOf10(String name){

        if(name.length() > 10){
            char firstIntitial = name.charAt(0);
            char lastInitial = name.charAt((name.length() - 1));

            System.out.println("The original name was: " + name);


            String fullname = firstIntitial + String.valueOf(name.length() - 2) + lastInitial;

            return fullname;
        }

            else
            return name;
    }

    public static void main(String[] args ){
        //sum of Two
        Solution problem1 = new Solution();
        System.out.println(problem1.sumOfTwo(10,5));

        //even odd
        Solution problem2 = new Solution();
        System.out.println(problem2.evenOdd(5));

        //abreviation
        Solution problem3 = new Solution();
        System.out.println(problem3.abbrevOf10("localization"));

    }

}
