package com.revature.problem;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UI {
    public static void main(String[] args){
        Solution sol = new Solution();
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a string: ");
        String userInput = scan.nextLine();

        System.out.println(sol.mostRecurringInteger(userInput));

    }
}
