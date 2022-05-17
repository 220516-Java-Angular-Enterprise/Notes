package com.revature.encapsulation;

public class UI {
    public static void main(String[] args) {
        /* instantiated a Problem object */
        Problem problem = new Problem();

        /* Print out the output when calling the problem object method filterUniqueChar*/
        /* Output should be asdfg since we are filtering out any duplicate characters */
        System.out.println(problem.filterUniqueChar("aaassssddddffffgggg"));
    }
}