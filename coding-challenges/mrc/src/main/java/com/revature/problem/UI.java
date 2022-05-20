package com.revature.problem;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        //create scanner to receive string input
        Scanner scnr = new Scanner(System.in);

        System.out.println(new Solution().mostRecurringInteger(scnr.nextLine()));

    }
}
