//requires the files in this pathso it can be used in the program
package com.revature.encapsulation;

//UI file is only for calling functions
public class UI {

//    ASK WHY STATIC VOID
//    public allows for the use of these commands by other classes
//    static allows you to use a class even with no object in it
//    void says method can have no return value
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.sumOfTwoNumbers(10, 10));

        System.out.println(sol.evenOdd(3));

        System.out.println(sol.abr("localization"));
    }
}